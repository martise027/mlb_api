package com.example.api.mlb_api.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.api.mlb_api.repository.PlayerRepository;

@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository repo){
        return args -> {

        };
    }
}
