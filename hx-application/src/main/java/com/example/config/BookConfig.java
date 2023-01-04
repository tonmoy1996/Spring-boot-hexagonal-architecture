package com.example.config;

import com.example.adapters.BookPersistenceImpl;
import com.example.port.api.BookServicePort;
import com.example.port.spi.BookPersistencePort;
import com.example.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BookConfig {
    @Bean
    public BookPersistencePort bookPersistencePort(){
        return new BookPersistenceImpl();
    }

    @Bean
    public BookServicePort bookServicePort(){
        return new BookServiceImpl(bookPersistencePort());
    }
}
