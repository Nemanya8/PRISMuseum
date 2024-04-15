package com.muzej.pris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PrisMuzejWikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrisMuzejWikiApplication.class, args);
	}

}
