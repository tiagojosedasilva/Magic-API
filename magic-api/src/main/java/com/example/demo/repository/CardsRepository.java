package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {
	
}
