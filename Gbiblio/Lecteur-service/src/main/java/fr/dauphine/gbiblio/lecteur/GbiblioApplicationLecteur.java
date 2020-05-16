package fr.dauphine.gbiblio.lecteur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GbiblioApplicationLecteur {

	public static void main(String[] args) {
		SpringApplication.run(GbiblioApplicationLecteur.class, args);
	}

}
