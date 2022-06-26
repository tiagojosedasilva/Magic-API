# Magic-API
Uma API Rest feita com Java Spring, na versão 11 LTS, possui apenas com um CRUD com conexão com banco de dados (o banco de dados escolhido foi o PostegreSQL) baseado no jogo Magic The Gathering, que é um jogo de cartas, este CRUD salva apenas as informações referentes as cartas de um determinado jogador e salvar no banco de dados.

As informações salvas são: O nome da carta,  a edição, o idioma,  o tipo, o preço e sua quantidade.

Para testar você pode acessar o link: https://magic-01.herokuapp.com/cards e cadastrar as cartas pelo  Postman selecionando as opções de GET, POST, PUT e DELETE.

Lembre-se de passar o id da carta quando for editar(PUT) e deletar(DELETE). Esse id pode ser passado adicionando uma "/" e o número da carta que deseja alterar, dessa formar:  /1 (o número pode ser qualquer um, desde que  exista uma carta cadastrada no banco de dados com ele). Vale resaltar que no caso de teste com o Postman, a ordem tem que ser exatamente a mesma, mas se utilizar de inputs de um site esta ordem pode ser alterada facilmente.

Caso não saiba, um id é o que identifica algo, é sua "identidade", nesse projeto assim que uma carta é cadastrada o id dele é gerado automaticamente.

Obs: Ainda não terminei este projeto, pretendo deixa-lo um pouco mais robusto adicionando também cadastro de usuários, entre outros...
