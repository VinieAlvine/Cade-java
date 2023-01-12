
public class Paire {
	private String cle;
	private String valeur;
	
	public String getCle() {
		return cle;
	}

	public void setCle(String cle) {
		this.cle = cle;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public Paire(String cle,String valeur) {
		this.cle = cle;
		this.valeur = valeur;
	}
	
}
