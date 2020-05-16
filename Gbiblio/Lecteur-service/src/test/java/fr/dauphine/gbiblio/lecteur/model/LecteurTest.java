package fr.dauphine.gbiblio.lecteur.model;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecteurTest {

    Lecteur l;

    @BeforeEach
    public void setUp() {
        l = new Lecteur(0, 'M', "nomTest", "prenomTest", "13/05/2000", "adresseTest");
    }

    @Test
    public void lecteur_NonVide_test(){
        assertEquals(l.getId(), 0);
        assertEquals(l.getGenre(), 'M');
        assertEquals(l.getNom(), "nomTest");
        assertEquals(l.getPrenom(), "prenomTest");
        assertEquals(l.getDatenaissance(), "13/05/2000");
        assertEquals(l.getAdresse(), "adresseTest");
    }

    @Test
    public void getId_test() {
        assertEquals(l.getId(), 0);
    }

    @Test
    public void setId_test() {
        l.setId(1);
        assertEquals(l.getId(), 1);
    }

    @Test
    public void getGenre_test() {
        assertEquals(l.getGenre(), 'M');
    }

    @Test
    public void setGenre_test() {
        l.setGenre('F');
        assertEquals(l.getGenre(), 'F');
    }

    @Test
    public void getNom_test() {
        assertEquals(l.getNom(),"nomTest");
    }

    @Test
    public void setNom_test() {
        l.setNom("nomTestNew");
        assertEquals(l.getNom(),"nomTestNew");
    }

    @Test
    public void getPrenom_test() {
        assertEquals(l.getPrenom(),"prenomTest");
    }

    @Test
    public void setPrenom_test() {
        l.setPrenom("prenomTestNew");
        assertEquals(l.getPrenom(),"prenomTestNew");
    }

    @Test
    public void getDatenaissance_test() {
        assertEquals(l.getDatenaissance(),"13/05/2000");
    }

    @Test
    public void setDatenaissance_test() {
        l.setDatenaissance("02/05/2000");
        assertEquals(l.getDatenaissance(),"02/05/2000");
    }

    @Test
    public void getAdresse_test() {
        assertEquals(l.getAdresse(),"adresseTest");
    }

    @Test
    public void setAdresse_test() {
        l.setAdresse("adresseTestNew");
        assertEquals(l.getAdresse(),"adresseTestNew");
    }

    @Test
    public void toString_Test(){
        String result = l.toString();
        String expected = "id : 0 ;\n" +
                " genre : M ;\n" +
                " nom : nomTest ;\n" +
                " prenom : prenomTest ;\n" +
                " date de naissance : 13/05/2000 ;\n" +
                " adresse : adresseTest";
        assertEquals(expected, result);
    }

    @Test
    public void equals_test(){
        Lecteur lecteurbis = new Lecteur(1, 'F', "nombisTest", "prenombisTest", "14/05/2000", "adressebisTest");
        Lecteur lecteurter = new Lecteur(0, 'M', "nomTest", "prenomTest", "13/05/2000", "adresseTest");

        assertNotEquals(l, lecteurbis);
        assertEquals(l, lecteurter);
    }
}
