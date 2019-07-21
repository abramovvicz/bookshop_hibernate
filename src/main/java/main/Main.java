package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookstore14jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManagerFactory.close();
        entityManager.close();
    }
}
