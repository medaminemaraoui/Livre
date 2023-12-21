package pk;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Livre livre1 = new Livre("TitreL1", "AuteurL1", 20.5, 300);
	        Livre livre2 = new Livre("TitreL2", "AuteurL2", 15.5, 250);
	        Roman roman1 = new Roman("TitreR1", "AuteurR1", 18.0, 350, "Edition1", 500);
	        Roman roman2 = new Roman("TitreR2", "AuteurR2", 22.0, 320, "Edition2", 600);

	        Livre[] livres = {livre1, livre2, roman1, roman2};

	        for (Livre livre : livres) {
	            livre.afficher();
	        }

	        Arrays.sort(livres);

	        System.out.println("\nAprès tri par prix :");
	        for (Livre livre : livres) {
	            livre.afficher();
	        }

	        Livre nouveauLivre = new Livre("NouveauLivre", "NouvelAuteur", 25.0, 280);
	        livres = Arrays.copyOf(livres, livres.length + 1);
	        livres[livres.length - 1] = nouveauLivre;

	        livres = Arrays.copyOfRange(livres, 1, livres.length);

	        		
	        List<Livre> listeLivres = Arrays.asList(livres);
	        Collections.reverse(listeLivres);
	        livres = listeLivres.toArray(new Livre[0]);
	}

}
