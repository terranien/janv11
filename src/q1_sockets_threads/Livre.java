package q1_sockets_threads;

import java.io.Serializable;

public class Livre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titre;
	private String auteur;
	
	public Livre(String titre, String auteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + "]";
	}
	
	
}
