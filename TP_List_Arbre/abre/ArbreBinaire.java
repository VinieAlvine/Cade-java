package CM5;

public class ArbreBinaire {

	private Noeud racine ;
	
	public ArbreBinaire() {
		racine = null;
	}
	
	public void ajoute(String cible, String valeur) {
		racine = ajouteRec(racine, cible, valeur);
	}
	
	private Noeud ajouteRec(Noeud courant, String cible, String valeur) {
		if (courant == null) {
			return new Noeud(valeur);
		}
		else {
			if (courant.valeur.equals(cible)) {
				if (courant.filsG == null) 
					courant.filsG = new Noeud(valeur);
				else if (courant.filsD == null)
					courant.filsD = new Noeud(valeur);
			} else {
				if (courant.filsG != null)
					courant.filsG = ajouteRec(courant.filsG, cible, valeur);
				if (courant.filsD != null)
					courant.filsD = ajouteRec(courant.filsD, cible, valeur);
			}
			return courant;
		}
	}
	
	public void ajoute2(String cible, String valeur) {
		if (racine == null)
			racine = new Noeud(valeur);
		else ajouteRec2(racine, cible, valeur);
	}
	
	public void ajouteRec2(Noeud courant, String cible, String valeur) {
		if (courant.valeur.equals(cible)) {
			if (courant.filsG == null) 
				courant.filsG = new Noeud(valeur);
			else if (courant.filsD == null)
				courant.filsD = new Noeud(valeur);
		} else {
			if (courant.filsG != null)
				ajouteRec2(courant.filsG, cible, valeur);
			if (courant.filsD != null)
				ajouteRec2(courant.filsD, cible, valeur);
		}
	}
	
	@Override
	public String toString() {
		return toStringRec(racine, "");
	}
	
	
	private String toStringRec(Noeud courant, String prefixe) {
		String tmp = "";
		if (courant != null) {
			// Parcours préfixe
			tmp += prefixe + courant.valeur + "\n" ;
			tmp += toStringRec(courant.filsG, prefixe + "   ") ;
			tmp += toStringRec(courant.filsD, prefixe + "   ");
			
			
			// parcours infixe
			/*
			tmp += toStringRec(courant.filsG, prefixe + "   ");
			tmp += prefixe + courant.valeur + "\n" ;
			tmp += toStringRec(courant.filsD, prefixe + "   ");
			*/
			
			// parcours postfixe
			/*
			tmp += toStringRec(courant.filsG, prefixe + "   ");
			tmp += toStringRec(courant.filsD, prefixe + "   ");
			tmp += prefixe + courant.valeur + "\n" ;
			*/
		}
		return tmp;
	}
}
