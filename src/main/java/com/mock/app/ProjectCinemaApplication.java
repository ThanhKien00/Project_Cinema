package com.mock.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.mock")
@EntityScan(basePackages = {"com.mock.model"})
@EnableJpaRepositories(basePackages = {"com.mock.repository"})
public class ProjectCinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectCinemaApplication.class, args);
    }

}
