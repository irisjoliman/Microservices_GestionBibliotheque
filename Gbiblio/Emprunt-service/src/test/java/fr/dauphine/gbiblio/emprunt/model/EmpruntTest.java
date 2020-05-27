package fr.dauphine.gbiblio.emprunt.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpruntTest {

    Emprunt e;

    @BeforeEach
    void setUp() {
        e = new Emprunt(0, "isbnTest", 0, "10/05/2020", "16/05/2020");
    }

    @Test
    public void emprunt_NonVide_test(){
        assertEquals(e.getId(), 0);
        assertEquals(e.getIsbn(), "isbnTest");
        assertEquals(e.getLecteur(), 0);
        assertEquals(e.getDatepret(), "10/05/2020");
        assertEquals(e.getDateretour(), "16/05/2020");
    }

    @Test
    public void getId_test() {
        assertEquals(e.getId(), 0);
    }

    @Test
    void setId_test() {
        e.setId(1);
        assertEquals(e.getId(), 1);
    }

    @Test
    void getIsbn_test() {
        assertEquals(e.getIsbn(), "isbnTest");
    }

    @Test
    void setIsbn_test() {
        e.setIsbn("isbnTestNew");
        assertEquals(e.getIsbn(), "isbnTestNew");
    }

    @Test
    void getLecteur_test() {
        assertEquals(e.getLecteur(), 0);
    }

    @Test
    void setLecteur_test() {
        e.setLecteur(1);
        assertEquals(e.getLecteur(), 1);
    }

    @Test
    void getDatepret_test() {
        assertEquals(e.getDatepret(), "10/05/2020");
    }

    @Test
    void setDatepret_test() {
        e.setDatepret("12/05/2020");
        assertEquals(e.getDatepret(), "12/05/2020");
    }

    @Test
    void getDateretour_test() {
        assertEquals(e.getDateretour(), "16/05/2020");
    }

    @Test
    void setDateretour() {
        e.setDateretour("18/05/2020");
        assertEquals(e.getDateretour(), "18/05/2020");
    }

    @Test
    public void toString_test(){
        String result = e.toString();
        String expected = "id : 0 ;\n" +
                " isbn : isbnTest ;\n" +
                " lecteur : 0 ;\n" +
                " date de pret : 10/05/2020 ;\n" +
                " date de retour : 16/05/2020";
        assertEquals(expected, result);
    }

    @Test
    public void equals_test(){
        Emprunt empruntbis = new Emprunt(1, "isbnNewTest", 1, "11/05/2020", "22/05/2020");
        Emprunt empruntter = new Emprunt(0, "isbnTest", 0, "10/05/2020", "16/05/2020");

        assertNotEquals(e, empruntbis);
        assertEquals(e, empruntter);
    }

}