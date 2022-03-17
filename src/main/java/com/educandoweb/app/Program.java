package com.educandoweb.app;

import com.educandoweb.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args){
        Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
        Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");


        //agora criamos uma factory de entity managers e o entity manager à partir dele
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        //abrindo a conexão
        em.getTransaction().begin();
        //salvando objetos no banco de dados:
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        //fechando a conexão
        em.getTransaction().commit();

        System.out.println("The objects have been saved!");
    }
}

/*
O output no database deverá ser o seguinte:
        mysql> select * from Person;
        +----+-------------------+-----------------+
        | id | email             | nomecompleto    |
        +----+-------------------+-----------------+
        |  1 | carlos@gmail.com  | Carlos da Silva |
        |  2 | joaquim@gmail.com | Joaquim Torres  |
        |  3 | ana@gmail.com     | Ana Maria       |
        +----+-------------------+-----------------+
*/