package com.example.demo.library.repository;

import com.example.demo.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * It is mandatory to add @Repository annotation over the interface for hibernate to scan and mark it as
 * a repository.
 *
 * It will extend the JpaRepository with the attribute as a Entity class and data type of the ID of that class
 *
 * JpaRepository< Book (It is a entity marked for this repository
 *                  so all the query result will be mapped with this class)
 *                  Integer(It is data type of the ID of Book class )
 *                 >
 *
 * */

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    /**
     * This method will be translated by JPA and implemention will be added by JPA.
     * It will internally result into: " select * from the book_table where title= "<TITLE>" we passed in the param
     *
     * */
    List<Book> findByTitle(String title);


  /***
   * Example to provide the custom query for a method, where it will wore like a prepared statement.
   * The ? in the query will replaced by the params passed in the method.
   *
   * If there are multiple ? in the query, the first param will be mapped to ? and so on.
   *
   *
   * @Query("select * from book_table where author=?")
    void findByAuthor(String author);

   */
}
