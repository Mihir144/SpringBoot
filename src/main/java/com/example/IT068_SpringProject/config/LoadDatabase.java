package com.example.IT068_SpringProject.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.IT068_SpringProject.entity.Student;
import com.example.IT068_SpringProject.repository.StudentRepo;


@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(StudentRepo p){
        return args -> {
//            log.info("Preloading " + p.save(new Student("Mihir","19IT068","IT")));
//            log.info("Preloading " + p.save(new Student("Sahil","19IT071","IT")));
        };
    }
}