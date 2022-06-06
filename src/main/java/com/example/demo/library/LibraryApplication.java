package com.example.demo.library;

import com.example.demo.library.domain.Book;
import com.example.demo.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	/**
	 * Step to setup mysql workbench in windows:
	 * https://www.youtube.com/watch?v=OM4aZJW_Ojs
	 * */

	@Autowired
	BookRepository repository;


	/**
	 * Sample code here to create a book object and save it to the book table
	 * */
	@Override
	public void run(String... args) throws Exception {
		Book b=new Book();
		b.setAuthor("John");
		b.setTitle("Intro to hibernate");
		repository.save(b);
	}
}
