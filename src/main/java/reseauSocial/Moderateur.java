package reseauSocial;

import java.time.LocalDate;

public class Moderateur extends Utilisateur{
    public Moderateur(LocalDate dateCreation, String email, String nom, String id) {
        super(dateCreation, email, nom, id);
    }
}
