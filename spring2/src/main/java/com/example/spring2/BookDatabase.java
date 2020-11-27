package com.example.spring2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BookDatabase {

    private static final Logger log = LoggerFactory.getLogger(BookDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Book("Enigma Otiliei","George Calinescu")));
            log.info("Preloading " + repository.save(new Book("Ion", "Liviu Rebreanu")));
            log.info("Preloading " + repository.save(new Book("Baltagul","Mihail Sadoveanu")));
            log.info("Preloading " + repository.save(new Book("Femeia in rosu","Mircea Nedelciu")));
            log.info("Preloading " + repository.save(new Book("Maitreyi","Mircea Eliade")));
        };
    }
}