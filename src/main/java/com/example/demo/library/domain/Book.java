package com.example.demo.library.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/***
 * @Entity annotation states to hibernate that it is the entity linked with database
 * @Table gives the name of the table name of mysql.
 *
 * */

@Data
@NoArgsConstructor
@Entity
@Table(name="book_table")
public class Book {

    /**
     * @Id is a mandatory annotation required for @Entity because each table should have one primary key in mysql
     * @Column is to map the java attribute name with the column name in the mysql
     * @GeneratedValue is the annotation which tells hibernate that it is auto generated value, and it is okay for      *                   the user not give value of it.
     * */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    private String author;

}
