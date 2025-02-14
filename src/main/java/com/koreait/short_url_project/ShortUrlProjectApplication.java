package com.koreait.short_url_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShortUrlProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortUrlProjectApplication.class, args);
    }

}
