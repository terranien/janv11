package q2_test;
import q2_classe.*;
import q2_exception.DateException;

public class TestEtu {
	public static void main(String[] args){
		Etudiant[] tabEtu = new Etudiant[5]; 
		try {
			tabEtu[0] = new Etudiant("Dick", "Romain", new Date("17/11/86"));
			tabEtu[1] = new Etudiant("Delreux", "Sophie", new Date("14/02/91"));
			tabEtu[2] = new Etudiant("Brulet", "Julien", new Date("13/10/86"));
			tabEtu[3] = new Etudiant("Rogge", "Marine", new Date("02/04/92"));
			tabEtu[4] = new Etudiant("Rézette", "François", new Date("27/12/88"));
			Tableau.tri(tabEtu);
			Tableau.affiche(tabEtu);
		} catch (DateException e) {
			System.out.println(e.toString());
		}
	}
}
