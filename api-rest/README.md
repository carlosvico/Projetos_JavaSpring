## Projeto simula o banco de dados de um forum de peguntas sobre tecnologia
### Tendo como entidades:
- `Mensagens`
- `Usuários`
- `Tópicos`
- `Cursos` 
<br>
### Nota
  - Não é uma boa prática retornar entidades JPA nos métodos dos controllers <br> O mais indicado é retornar classes que seguem o padrão  DTO  `(Data Transfer Object)`

## Tecnologias Usadas:
<br>

- [x] Spring `JPA`
- [x] Spring Data
- [x] Persistencia na memória com banco de dados `H2` : `org.h2.Driver`
