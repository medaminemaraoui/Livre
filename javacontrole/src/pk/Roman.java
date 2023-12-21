package pk;

public class Roman extends Livre {
    private String maisonEdition;
    private int nbExemplaire;

    public Roman(String titre, String auteur, double prix, int nbPages, String maisonEdition, int nbExemplaire) {
        super(titre, auteur, prix, nbPages);
        this.maisonEdition = maisonEdition;
        this.nbExemplaire = nbExemplaire;
    }

    @Override
    public String toString() {
        return "Roman{" +
                "maisonEdition='" + maisonEdition + '\'' +
                ", nbExemplaire=" + nbExemplaire +
                "} " + super.toString();
    }

    @Override
    public Roman clone() throws CloneNotSupportedException {
        return (Roman) super.clone();
    }

    public void afficher() {
        System.out.println("Type: Roman, " + this.toString());
    }
}

