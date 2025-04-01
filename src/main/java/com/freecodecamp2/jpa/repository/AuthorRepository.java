package com.freecodecamp2.jpa.repository;

import com.freecodecamp2.jpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}

/*
    The Repositories abstraction is to reduce the amount of boilerplate code
    needed to implement the DAO ( Data Access Object ) to interact with data
    stores
*/