package com.codingdojo.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.repositories.BookRepository;


@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
    // devuelve todos los book
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // crea un book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    //actualiza un book
    public Book updateBook(Book b) {
        return bookRepo.save(b);
    }
    // recupera un book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }
}
