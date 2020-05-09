package fr.dauphine.gbiblio.livre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GbiblioApplicationLivre {

	public static void main(String[] args) {
		SpringApplication.run(GbiblioApplicationLivre.class, args);
	}

}
