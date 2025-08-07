package reseauSocial;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GroupeTest {
    @Test
    public void testCreationPublication(){
        Publication haja = new Publication("haja" , "mahay be i haja", LocalDate.now());
        assertEquals("haja", haja.getTitre());
    }

    @Test
    public void testCreationCommentaire(){
        Commentaire comment = new Commentaire("commentaire");
        assertEquals("commentaire", comment.getContenu());
    }

}