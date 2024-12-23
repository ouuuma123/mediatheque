package com.example.mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliothèque {
    private List<Livre> livres;

    public Bibliothèque() {
        this.livres = new ArrayList<Livre>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public List<Livre> listerLivres() {
        return livres;
    }
}
