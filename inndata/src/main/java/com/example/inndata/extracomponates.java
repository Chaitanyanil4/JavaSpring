package com.example.inndata;

import org.modelmapper.ModelMapper; // Import the correct ModelMapper class
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class extracomponates {

    @Bean
    public ModelMapper modalmapper() {
        return new ModelMapper();
    }
}
