package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
