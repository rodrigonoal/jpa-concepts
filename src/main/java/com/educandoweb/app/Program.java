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

        //abrindo a conexão e transação
        em.getTransaction().begin();
        //salvando objetos no banco de dados:
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        System.out.println("The objects have been saved!");
        //fechando a transação
        em.getTransaction().commit();

        //encontrando dado no banco
        System.out.println("Searching...");
        Person p = em.find(Person.class, 2);
        System.out.println("Person found:" + p);

        //deletando dado no banco
        //IMPORTANTE: para deletar precisamos pesquisar o dado antes!
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        System.out.println("Person 2 removed!");

        //fechando a conexão
        em.close();
        emf.close();

    }
}