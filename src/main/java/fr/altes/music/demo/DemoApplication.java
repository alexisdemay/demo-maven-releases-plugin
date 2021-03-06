package fr.altes.music.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		log.info("Lancement de l'application ...");

		SpringApplication.run(DemoApplication.class, args);
	}

}
