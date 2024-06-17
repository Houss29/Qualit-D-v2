package houssna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {



    @Test
    public void testVoiture(){
        Voiture audi = new Voiture("Audi", 12500.0f);
        assertEquals("Voiture{marque='Audi', prix=12500.0}", audi.toString());
    }

    @Test
    public void testGetMarque(){
        Voiture audi = new Voiture("Audi", 12500.0f);
        assertEquals("Audi",audi.getMarque());
    }
    @Test
    public void testSetMarque(){
        Voiture audi = new Voiture("Audi", 12500.0f);
        audi.setMarque("Tesla");
        assertEquals("Tesla",audi.getMarque());
    }

    @Test
    public void testSetPrix(){
        Voiture audi = new Voiture("Audi", 12500.0f);
        audi.setPrix(50000.f);
        assertEquals(50000.f,audi.getPrix());
    }

    @Test
    public void testGetPrix(){
        Voiture audi = new Voiture("Audi", 12500.0f);
        assertEquals(12500.0,audi.getPrix());
    }






}
