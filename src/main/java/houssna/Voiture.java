package houssna;
public class Voiture {

    private String marque ;
    private float prix ;

    public Voiture(String marque1, float prix1) {

        this.marque = marque1 ;
        this.prix = prix1 ;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setMarque(String marque1) {
        this.marque = marque1;
    }

    public void setPrix(float prix1) {
        this.prix = prix1;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
        ", prix=" + prix +
                '}';
    }
}