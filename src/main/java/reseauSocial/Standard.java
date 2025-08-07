package reseauSocial;

import java.time.LocalDate;

public class Standard extends Utilisateur{
    public Standard(LocalDate dateCreation, String email, String nom, String id) {
        super(dateCreation, email, nom, id);
    }
}
