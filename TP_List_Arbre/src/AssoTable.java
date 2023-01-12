public abstract class AssoTable {

	/**
	 * Cr�e une association entre une cl� et une valeur. 
	 * Si une association (cl�, autre valeur) existe d�j�, elle est �cras�e. 
	 * 
	 * @param cle Cl� de l'association, suppos�e non nulle
	 * @param valeur  Valeur de l'association, supposée non nulle
	 */
	public abstract void associe(String cle, String valeur) ;
	
	/**
	 * Supprime l'association (cle, valeur) si elle existe, sinon ne fait rien
	 * 
	 * @param cle Cl� de l'association � supprimer
	 */
	public abstract void supprime(String cle) ;
	
	/**
	 * Renvoie la valeur associ�e � la cl� indiqu�e.
	 * 
	 * @param cle Cl� recherch�e
	 * @return Valeur associ�e � cle, null sinon
	 */
	public abstract String get(String cle) ;
	
	
	
}
