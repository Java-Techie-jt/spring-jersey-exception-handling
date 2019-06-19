package com.javatechie.spring.rest.api;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatechie.spring.rest.api.dao.EmployeeDao;
import com.javatechie.spring.rest.api.model.Employee;

@SpringBootApplication
public class SpringRestJerseyExampleApplication {
	
	@Autowired
	private EmployeeDao dao;
	
	@PostConstruct
	public void initDB() {
		dao.saveAll(Stream.of(new Employee(890,"peter","DEV"),new Employee(680,"sam","QA"),new Employee(143,"John","HR")).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestJerseyExampleApplication.class, args);
	}

}
