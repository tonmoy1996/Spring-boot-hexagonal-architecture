package com.example.adapters;

import com.example.data.BookDto;
import com.example.entity.Book;
import com.example.mappers.BookMapper;
import com.example.port.spi.BookPersistencePort;
import com.example.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookPersistenceImpl implements BookPersistencePort {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDto addBook(BookDto bookDto) {
        Book book= BookMapper.INSTANCE.bookDtoToBook(bookDto);
        Book bookSaved= bookRepository.save(book);

        return BookMapper.INSTANCE.bookToBookDto(bookSaved);
    }

    @Override
    public void deleteBookById(Long id) {

    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        return null;
    }

    @Override
    public List<BookDto> getBooks() {
        return null;
    }

    @Override
    public BookDto getBookById(Long bookId) {
        return null;
    }
}
