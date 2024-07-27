package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired
	Apple apple;

	@Autowired
	Apple apple2;

	DBService service;

	public IntroductionToSpringBootApplication(DBService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication .class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		apple.eatApple();
//		apple2.counter = 5;
//		apple.eatApple();
		System.out.println(service.getData());
	}
}
