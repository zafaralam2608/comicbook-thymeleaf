package com.project.comicbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.modelmapper.ModelMapper;

@SpringBootApplication
public class Application {
    /**
     * The main method of the application.
     *
     * @param args the runtime arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Creates an instance of ModelMapper.
     *
     * @return the ModelMapper
     */
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
