package com.example.port.spi;

import com.example.data.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookPersistencePort {

    BookDto addBook(BookDto bookDto);

    void deleteBookById(Long id);

    BookDto updateBook(BookDto bookDto);

    List<BookDto> getBooks();

    BookDto getBookById(Long bookId);
}
