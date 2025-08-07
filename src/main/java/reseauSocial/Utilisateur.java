package reseauSocial;

import java.time.LocalDate;

public class Utilisateur {
    private String id;
    private String nom;
    private String email;
    private LocalDate dateCreation;

    public Utilisateur(LocalDate dateCreation, String email, String nom, String id) {
        this.dateCreation = dateCreation;
        this.email = email;
        this.nom = nom;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public boolean autoriserDeSupprimerPublication(){
        return false;
    }
}
