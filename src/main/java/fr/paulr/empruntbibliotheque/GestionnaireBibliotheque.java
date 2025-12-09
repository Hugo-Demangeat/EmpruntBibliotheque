/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.paulr.empruntbibliotheque;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utilisateur
 */
public class GestionnaireBibliotheque {
     private List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        items.add(item);
    }
// ne respecte pas le principe Open/Closed car si on ajoute un nouveau type d'article,
// il faut modifier cette méthode
    public void processItem(Object item, String type) {
        if ("livre".equalsIgnoreCase(type)) {
            Livre l = (Livre) item;
            l.emprunter();
            l.imprimeEtiquette();
            l.connexionBDD();
            l.envoyerNotifEmail("Livre emprunté !");
        } else if ("dvd".equalsIgnoreCase(type)) {
            DVD d = (DVD) item;
            d.rendreArticle();
            d.imprimeEtiquette();
            d.connexionBDD();
        } else {
            System.out.println("Type d'article inconnu : " + type);
        }
    }
}