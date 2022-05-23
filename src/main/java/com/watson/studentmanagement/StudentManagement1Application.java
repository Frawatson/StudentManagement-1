package com.watson.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.watson.studentmanagement.model")
@EnableJpaRepositories("com.watson.studentmanagement.repository")
@ComponentScan("com.*")
public class StudentManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagement1Application.class, args);
	}

}
