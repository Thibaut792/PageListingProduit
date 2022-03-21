package com.example.geolocalisation;

public class Item {
    String nom;
    int photo;
    int quantite;

    public Item(String nom, int photo, int quantite) {
        this.nom = nom;
        this.photo = photo;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
