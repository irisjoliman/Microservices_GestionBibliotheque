package fr.dauphine.gbiblio.emprunt.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmpruntIntrouvableException extends RuntimeException {
    public EmpruntIntrouvableException(String s) {
        super(s);
    }
}
