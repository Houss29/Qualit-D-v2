package Service;

        import houssna.Voiture;
        import java.util.ArrayList;

public class StatistiqueImplement implements Statistique {
    private ArrayList<Voiture> listeVoiture = new ArrayList<Voiture>();

    public StatistiqueImplement(ArrayList<Voiture> listeVoitures){
        this.listeVoiture = listeVoitures;
    }

    @Override
    public void ajouter(Voiture voiture) {
        this.listeVoiture.add(voiture);
    }

    @Override
    public int prix() throws ArithmeticException {
        if (listeVoiture.isEmpty()) {
            throw new ArithmeticException("La liste est vide");
        }

        int sommePrix = 0;
        for (Voiture voiture : listeVoiture) {
            sommePrix += voiture.getPrix();
        }

        int nombreVoitures = listeVoiture.size();
        int nombreRemises = nombreVoitures / 5;
        double remise = Math.min(nombreRemises * 0.05 * sommePrix, 20000.0);
        int prixFinal = (int) (sommePrix - remise);

        return prixFinal;
    }
}
