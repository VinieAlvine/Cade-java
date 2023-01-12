package CM5;

public class Noeud {
	
	public String valeur;
	public Noeud filsG;
	public Noeud filsD;
	
	public Noeud(String valeur) {
		this.valeur = valeur;
		this.filsG = null;
		this.filsD = null;
	}

	public Noeud(String valeur, Noeud filsG, Noeud filsD) {
		this.valeur = valeur;
		this.filsG = filsG;
		this.filsD = filsD;
	}
	
}
