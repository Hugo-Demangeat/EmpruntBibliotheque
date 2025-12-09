/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fr.paulr.empruntbibliotheque;

/**
 *
 * @author Utilisateur
 */
// ne respecte pas le ISP car cette interface n'est pas spécialisée.
/*
public interface ArticleEmpruntable {

    void emprunter();

    void rendreArticle();

    void calculerPenaliteDeRetard(int jours);

    void imprimeEtiquette();

    void connexionBDD();

    void envoyerNotifEmail(String message);
}
*/

// Respecte le ISP en divisant l'interface en plusieurs interfaces spécifiques.
public interface EmprunterArticle {
    void emprunter();
}
public interface RendreArticle {
    void rendreArticle();
}
public interface CalculerPenalite {
    void calculerPenaliteDeRetard(int jours);
}
public interface ImprimerEtiquette {
    void imprimeEtiquette();
}
public interface ConnexionBDD {
    void connexionBDD();
}
public interface EnvoyerNotifEmail {
    void envoyerNotifEmail(String message);
}