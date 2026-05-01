package org.example.mini.library.application.system.controller;


import org.example.mini.library.application.system.dto.BookDto;
import org.example.mini.library.application.system.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void save(@RequestBody BookDto bookDto) {
        bookService.save(bookDto);
    }

    @GetMapping
    public List<BookDto> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public BookDto findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @GetMapping("/search")
    public List<BookDto> findByTitleIgnoreCase(@RequestParam(name = "title") String title) {
        return bookService.findByTitleIgnoreCase(title);
    }

    @GetMapping("out-of-stock")
    List<BookDto> findUnavailableBooks() {
        return bookService.findUnavailableBooks();
    }
}
