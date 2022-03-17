# JPA e Persistência



## Sobre a Persistência

Não é fácil comunicar a abordagem orientada a objetos com a abordagem relacional. Por isso existem bancos de dados capazes de armazenar objetos, por exemplo. Por outro lado, essa comunicação se fa muitas vezes necessária.

Anteriormente tínhamos de fazer essa tradução na mão, puxando a tabela com uma query SQL, então traduzir cada informação para o atributo de um objeto.

Outros problemas são:
- Contexto de persistência (que objeto está atrelado a uma conexão naquele momento)
- Mapa de identidade (colocar os objetos no cache para evitar retrabalho)
- Lazy loading (carregar apenas uma parte de um objeto; ex: informações apenas das categorias a que pertencem os objetos)

## Java Persistence API

Uma especificação padrão da plataforma Java EE para mapeamento objeto-relacional e persistência de dados.

Algumas implementações da JPA que devem ser incluídas ao fazer uso do pacote: [Hibernate, EclipseLink & Apache OpenJPA]

```java
import javax.persistence.*;
```

### Principais classes

**Entity Manager**

Encapsula uma conexão com a base de dados e serve para efetuar operações de CRUD m entidades monitoradas no mesmo conteto de persistência.

Escopo: Um entity manager trabalha com todos os dados de uma requisição.

**Entity Manager Factory**

É utilizado para instanciar ENtity Managers. Tipicamente uma só é necessária para a aplicação.
