package com.infosys.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MicroserviceCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCrudApplication.class, args);
	}

}
