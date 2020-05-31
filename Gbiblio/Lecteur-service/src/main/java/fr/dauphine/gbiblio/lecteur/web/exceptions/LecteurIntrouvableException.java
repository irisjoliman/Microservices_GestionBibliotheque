package fr.dauphine.gbiblio.lecteur.web.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LecteurIntrouvableException extends RuntimeException {
    public LecteurIntrouvableException(String s) {
        super(s);
    }
}
