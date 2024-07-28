package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	CakeBaker obj;
	public IntroductionToSpringBootApplication(CakeBaker obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication .class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		obj.bakeCake();
	}
}
