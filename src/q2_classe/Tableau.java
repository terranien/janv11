package q2_classe;

public class Tableau {
	public static void tri(Comparable[] tab){
		Comparable cp = null;
		for(int i = 0; i < tab.length - 1; i++){
			for(int j = i + 1; j < tab.length; j++){
				if(tab[i].compareTo(tab[j]) < 0)
					cp = tab[i];
					tab[i] = tab[j];
					tab[j] = cp;
			}
		}
	}
	public static void affiche(Affichable[] tab){{
		for(Affichable a : tab){
			a.affiche();
		}
	}
		
	}
}
