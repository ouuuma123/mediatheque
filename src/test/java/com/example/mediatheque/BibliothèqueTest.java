package com.example.mediatheque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliothèqueTest {
    @Test
    public void testAjouterLivre() {
        Bibliothèque bibliothèque = new Bibliothèque();
        Livre livre = new Livre("1984", "George Orwell");
        bibliothèque.ajouterLivre(livre);
        assertEquals(1, bibliothèque.listerLivres().size());
        assertEquals("1984", bibliothèque.listerLivres().get(0).getTitre());
    }
}
