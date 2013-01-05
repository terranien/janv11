package q2_classe;

public class Etudiant extends Personne implements Comparable<Etudiant>, Affichable{
	public static int compteur = 0;
	private int noma;
	
	public Etudiant() {
		super();
		this.noma = compteur;
		compteur++;
	}
	public Etudiant(String nom, String prenom, Date ddn) {
		super(nom, prenom, ddn);
		this.noma = compteur;
		compteur++;
	}
	
	public int getNoma() {
		return noma;
	}
	public void setNoma(int noma) {
		this.noma = noma;
	}
	@Override
	public int compareTo(Etudiant o) {
		return this.noma - o.noma;
	}
	@Override
	public String toString() {
		return "Etudiant [noma=" + noma + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void affiche() {
		System.out.println(this.toString());
	}

	
}
