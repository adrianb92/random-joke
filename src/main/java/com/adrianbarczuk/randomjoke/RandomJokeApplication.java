package com.adrianbarczuk.randomjoke;

import com.adrianbarczuk.randomjoke.services.JokeService;
import com.adrianbarczuk.randomjoke.services.JokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RandomJokeApplication {

	public static void main(String[] args) { ApplicationContext context = SpringApplication.run(RandomJokeApplication.class, args); }
}
