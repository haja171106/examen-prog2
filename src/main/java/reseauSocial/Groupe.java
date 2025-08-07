package reseauSocial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Groupe {
    private String nom;
    private Administrateur administrateur;
    private List<Utilisateur> utilisateur;
    private List<Publication> publication = new ArrayList<>();

    public Groupe(String nom, Administrateur administrateur, List<Utilisateur> utilisateur, List<Publication> publication) {
        this.nom = nom;
        this.administrateur = administrateur;
        this.utilisateur = utilisateur;
        this.publication = publication;
    }

    public String getNom() {
        return nom;
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public List<Utilisateur> getUtilisateur() {
        return utilisateur;
    }

    public List<Publication> getPublication() {
        return publication;
    }

    public void creerPublication(Publication publication) {
        this.publication.add(publication);
    }

    public void supprimerPublication(Publication publication) {
        this.publication.remove(publication);
    }

    public Publication chercherPublication(String mot) {
        for (Publication publication : this.publication) {
            if(publication.getContenu().toLowerCase().equals(mot)){
                return publication;
            }
        }
        return null;
    }

    public Utilisateur VerifierPresenceUtilisateur(String nom) {
        if(utilisateur.isEmpty()){
            return null;
        }
        return (Utilisateur) utilisateur.stream().filter(x -> x.getNom().equals(nom)).collect(Collectors.toList());
    }
}
