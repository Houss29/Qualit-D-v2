package houssna;
        import Service.StatistiqueImplement;
        import Service.Statistique;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import java.util.ArrayList;

        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatistiqueTest {

    private Statistique service ;
    private Statistique garageHoussna ;

    @BeforeEach
    void setup(){
        Voiture voiture1 = new Voiture ("Tesla", 10);
        Voiture voiture2 = new Voiture ("Mercedes-Benz", 10);
        Voiture voiture3 = new Voiture ("Renault", 10);
        Voiture voiture4 = new Voiture ("Jaguar", 10);
        Voiture voiture5 = new Voiture ("Rolls-Royce", 10);
        Voiture voiture6 = new Voiture ("Volkswagen", 10);
        Voiture voiture7 = new Voiture ("Audi", 10);
        ArrayList<Voiture> listeVoitures = new ArrayList();
        ArrayList<Voiture> listeVide = new ArrayList();
        garageHoussna = new StatistiqueImplement(listeVoitures);
        service= new StatistiqueImplement(listeVide);
        service.ajouter(voiture1);
        service.ajouter(voiture2);
        service.ajouter(voiture3);
        service.ajouter(voiture4);
        service.ajouter(voiture5);
        service.ajouter(voiture6);
        service.ajouter(voiture7);

    }

    @Test
    void testPrix() {
        int Prix = 66; // calculate the expected price with one discount
        assertEquals(Prix, service.prix());
    }

    @Test
    void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                garageHoussna.prix());
    }


}
