package com.example.library_management;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Save a book
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    // Get a book by ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Update a book
    public void updateBook(Long id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new IllegalStateException("Book not found"));
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setIsbn(updatedBook.getIsbn());
        existingBook.setQuantity(updatedBook.getQuantity());
        bookRepository.save(existingBook);
    }
}
