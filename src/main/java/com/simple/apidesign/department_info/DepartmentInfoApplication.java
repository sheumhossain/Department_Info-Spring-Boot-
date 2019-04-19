package com.simple.apidesign.department_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = StudentsController.class)

@SpringBootApplication
public class DepartmentInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentInfoApplication.class, args);
	}

}
