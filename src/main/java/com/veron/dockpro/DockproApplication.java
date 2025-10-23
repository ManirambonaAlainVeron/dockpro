package com.veron.dockpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class DockproApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

        // Apply them to the environment
        dotenv.entries().forEach(entry -> 
            System.setProperty(entry.getKey(), entry.getValue())
        );
		
		SpringApplication.run(DockproApplication.class, args);
	}

}
