package reseauSocial;

import java.time.LocalDate;
import java.util.Arrays;

public class Publication {
    private String titre;
    private String contenu;
    private LocalDate dateCreation;
    private Commentaire commentaire;

    public Publication(String titre, String contenu, LocalDate dateCreation) {
        this.titre = titre;
        this.contenu = contenu;
        this.dateCreation = dateCreation;
        this.commentaire = commentaire;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }

    public static void main(String[] args) {
        Publication publication1 = new Publication("haja" ,"haja mahay be , angamba",LocalDate.now());
        Groupe.chercherPublication("haja");
    }
}
