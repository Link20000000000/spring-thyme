package com.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
