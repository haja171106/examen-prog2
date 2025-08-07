package reseauSocial;

import java.time.LocalDate;

public class Administrateur{
    private int id;
    private String nom;
    private LocalDate dateCreation;
    private String email;

    public Administrateur(int id, String nom, LocalDate dateCreation, String email) {
        this.id = id;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public String getEmail() {
        return email;
    }
}
