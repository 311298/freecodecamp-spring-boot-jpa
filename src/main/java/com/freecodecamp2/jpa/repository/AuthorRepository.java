package com.freecodecamp2.jpa.repository;

import com.freecodecamp2.jpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    List<Author> findAllByFirstName(String fn);
    List<Author> findAllByFirstNameIgnoreCase(String fn);
    // select * from Author where first_name like '%anu%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);
    List<Author> findAllByFirstNameInIgnoreCase(List<String> fn);

}

/*
    The Repositories abstraction is to reduce the amount of boilerplate code
    needed to implement the DAO ( Data Access Object ) to interact with data
    stores
*/