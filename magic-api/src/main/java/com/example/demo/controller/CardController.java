package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cards;
import com.example.demo.repository.CardsRepository;


@RestController
@RequestMapping("/cards")
public class CardController {
	
	@Autowired
	private CardsRepository cardsRepository;
	
	@GetMapping
	public List<Cards> listar(){
		return cardsRepository.findAll();
	}
	@PostMapping
	public Cards adicionar(@RequestBody Cards cards) {
		return cardsRepository.save(cards);
	}
	
	@GetMapping("{id}")
	public Cards getCardsById(@PathVariable Long id) {
		return cardsRepository.findById(id).get();
	}
	@PutMapping("{id}")
	public ResponseEntity<Cards> update(@PathVariable("id") Long id, @RequestBody Cards cards) {
		return cardsRepository.findById(id).map(record ->{
			record.setNome(cards.getNome());
			record.setEdicao(cards.getEdicao());
			record.setIdioma(cards.getIdioma());
			record.setTipo(cards.getTipo());
			record.setPreco(cards.getPreco());
			record.setQuant(cards.getQuant());
			Cards updated = cardsRepository.save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("{id}")
	public void deletarCard(@PathVariable Long id) {
		cardsRepository.deleteById(id);
	}
}
