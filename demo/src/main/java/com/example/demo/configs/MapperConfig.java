package com.example.demo.configs;

import org.springframework.context.annotation.Bean;

public class MapperConfig {
    @Bean
    public  ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
