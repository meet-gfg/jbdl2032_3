package com.example.demo.library;

import com.example.demo.library.domain.Book;
import com.example.demo.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    /**
     *  here we have done the field injection of the repository.
     * */

    @Autowired
    BookRepository repository;

    /***
     * the above method will call the repository and get the list of the book from the database
     * */
    public List<Book> getBooksByTitle(String title){
        return repository.findByTitle(title);
    }


    /**
     * findAll,findById.. are few pre-defined method of the JpaRepository and can be called on requirement.
     *
     * */
    public List<Book> getAllBooks(){
        return repository.findAll();
    }


 }
