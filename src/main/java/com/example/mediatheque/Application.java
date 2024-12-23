package com.example.mediatheque;

public class Application {
    public static void main(String[] args) {
        Bibliothèque bibliothèque = new Bibliothèque();
        bibliothèque.ajouterLivre(new Livre("1984", "George Orwell"));
        bibliothèque.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry"));

        for (Livre livre : bibliothèque.listerLivres()) {
            System.out.println(livre);
        }
    }
}
