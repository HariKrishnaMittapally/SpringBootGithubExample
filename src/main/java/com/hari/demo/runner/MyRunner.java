package com.hari.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("WELCOME TO GIT HUB!!");

	}

}
