package com.example.geolocalisation;

import org.json.JSONArray;

public class EntrerProducts {


    public EntrerProducts(int reference, float prix_HT, String description, int batiments_adresse, int etagereID, int fournisseur, String img, int rangerID, int rauyonID, int sectionID, int quantiteADD) {
        this.reference = reference;
        this.prix_HT = prix_HT;
        this.description = description;
        this.batimentID = batiments_adresse;
        this.etagereID = etagereID;
        this.fournisseur = fournisseur;
        this.img = img;
        this.rangerID = rangerID;
        this.rayonID = rauyonID;
        this.sectionID = sectionID;
        this.quantiteADD = quantiteADD;
    }

    int reference;
    float prix_HT;
    String description;
    int batimentID;
    int etagereID;
    int fournisseur;
    String img;
    int rangerID;
    int rayonID;
    int sectionID;
    int quantiteADD;



}
