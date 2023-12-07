package com.elastic.testcontainer.demo.service;

import com.elastic.testcontainer.demo.domain.Book;
import com.elastic.testcontainer.demo.service.exception.BookNotFoundException;
import com.elastic.testcontainer.demo.service.exception.DuplicateIsbnException;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> getByIsbn(String isbn);

    List<Book> getAll();

    List<Book> findByAuthor(String authorName);

    List<Book> findByTitleAndAuthor(String title, String author);

    Book create(Book book) throws DuplicateIsbnException;

    void deleteById(String id);

    Book update(String id, Book book) throws BookNotFoundException;
}
