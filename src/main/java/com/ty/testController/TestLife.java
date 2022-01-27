package com.ty.testController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Biography;
import com.ty.dto.Book;

public class TestLife {

	public static void main(String[] args) {

		Book book=new Book();
		book.setId(4);
		book.setName("Think like a Monk");
		book.setPrice(499);
		
		Biography bio=new Biography();
		bio.setId(104);
		bio.setName("Jay Shetty");
		bio.setLocation("London");
		
		book.setBio(bio);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("book");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(book);
		entityManager.persist(bio);
		entityTransaction.commit();
	}

}
