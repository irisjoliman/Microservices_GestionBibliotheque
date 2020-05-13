package fr.dauphine.gbiblio.livre.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivreTest {

    Livre l;

    @BeforeEach
    public void setUp() {
        l = new Livre("isbnTest", "auteurTest", "titreTest", "editeurTest", 0);
    }

    @Test
    void getIsbn_test() {
        assertEquals(l.getIsbn(), "isbnTest");
    }

    @Test
    void setIsbn_test() {
        l.setIsbn("isbnTestNew");
        assertEquals(l.getIsbn(), "isbnTestNew");
    }

    @Test
    public void getAuteur_test() {
        assertEquals(l.getAuteur(), "auteurTest");
    }

    @Test
    public void setAuteur_test() {
        l.setAuteur("auteurTestNew");
        assertEquals(l.getAuteur(), "auteurTestNew");
    }

    @Test
    public void getTitre_test() {
        assertEquals(l.getTitre(), "titreTest");
    }

    @Test
    public void setTitre_test() {
        l.setTitre("titreTestNew");
        assertEquals(l.getTitre(), "titreTestNew");
    }

    @Test
    public void getEditeur_test() {
        assertEquals(l.getEditeur(), "editeurTest");
    }

    @Test
    public void setEditeur_test() {
        l.setEditeur("editeurTestNew");
        assertEquals(l.getEditeur(), "editeurTestNew");
    }

    @Test
    public void getEdition_test() {
        assertEquals(l.getEdition(), 0);
    }

    @Test
    public void setEdition_test() {
        l.setEdition(1);
        assertEquals(l.getEdition(), 1);
    }

    @Test
    public void toString_test(){
        String result = l.toString();
        String expected = "isbn : isbnTest ;\n" +
                " titre : titreTest ;\n" +
                " auteur : auteurTest ;\n" +
                " editeur : editeurTest ;\n" +
                " edition : 0";
        assertEquals(expected, result);
    }

    @Test
    public void equals_test(){
        Livre livrebis = new Livre("isbnBisTest", "auteurBisTest", "titreBisTest", "editeurBisTest", 2);
        Livre livreter = new Livre("isbnTest", "auteurTest", "titreTest", "editeurTest", 0);

        assertNotEquals(l, livrebis);
        assertEquals(l, livreter);
    }
}