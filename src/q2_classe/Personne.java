package q2_classe;

public class Personne {
	private String nom;
	private String prenom;
	private Date ddn;
	
	
	public Personne() {
		super();
	}
	public Personne(String nom, String prenom, Date ddn) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ddn = ddn;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDdn() {
		return ddn;
	}
	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", ddn=" + ddn
				+ "]";
	}
	
	
	
}
