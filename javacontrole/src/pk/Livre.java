package pk;

public class Livre implements Comparable<Livre>, Cloneable {
    private String titre;
    private String auteur;
    private double prix;
    private int nbPages;
    private static int nombreTotalLivres = 0;
    private static double prixMax = Double.MIN_VALUE;
    private static double prixMin = Double.MAX_VALUE;

    public Livre(String titre, String auteur, double prix, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPages = nbPages;
        nombreTotalLivres++;
        prixMax = Math.max(prixMax, prix);
        prixMin = Math.min(prixMin, prix);
    }

    public static int getNombreTotalLivres() {
        return nombreTotalLivres;
    }

    public static double getPrixMax() {
        return prixMax;
    }

    public static double getPrixMin() {
        return prixMin;
    }

    // Implémentation de Comparable
    @Override
    public int compareTo(Livre autreLivre) {
        return Double.compare(this.prix, autreLivre.prix);
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", nbPages=" + nbPages +
                '}';
    }

    @Override
    public Livre clone() throws CloneNotSupportedException {
        return (Livre) super.clone();
    }

    public void afficher() {
        System.out.println("Type: Livre, " + this.toString());
    }
}
