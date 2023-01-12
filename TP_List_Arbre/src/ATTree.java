
public class ATTree extends AssoTable{
private Noeud racine;
	
	public String toString() {
		return toStringRec(racine, " ") ;
	}
	
	private String toStringRec(Noeud courant, String prefixe) {
		if (courant != null) {
			String result = " ";
			
			result += prefixe + courant.couple +"\n";
			result += toStringRec(courant.filsGauche, prefixe + "   ") ;
			result += toStringRec(courant.filsDroit, prefixe + "   ") ;
			
			
			return result;
		} else
			return " "; 
	}
		
	@Override
	public void associe(String cle, String valeur) {
	
		racine = associeN(racine, cle,  valeur);
	}
	// foction   qui ajoute les noeuds
		private Noeud  associeN(Noeud cible, String cle, String valeur) {
			Paire coup=new Paire(cle,valeur);
			if (cible == null) {
				return new Noeud(coup);
			} else  {
				
					if(cible.couple.getCle().compareTo(cle)<0) {
						cible.filsDroit = associeN(cible.filsDroit,cle, valeur);
						}
					else  if(cible.couple.getCle().compareTo(cle)>0) {
							cible.filsGauche = associeN(cible.filsGauche,cle, valeur);}
					else {
						cible.couple.setValeur(valeur);
						return cible;}
					
				}
			 
			return cible;
		}
			
	@Override
	public void supprime(String cle) {
		racine = supprimeR(racine, cle);
	}
public  Noeud supprimeR(Noeud cible, String cle) {
	if (cible == null) {
		return null;
	} else  {
		
			if(cible.couple.getCle().compareTo(cle)<0) {
				// il n'y  a pas d'égalité donc on  continue
				cible.filsDroit = supprimeR(cible.filsDroit, cle);
				}
			else  if(cible.couple.getCle().compareTo(cle)>0) {
				// il n'y  a pas d'égalité donc on  continue 
				cible.filsGauche = supprimeR(cible.filsGauche, cle);}
			else { 
				// il y  a égalité 
				if(cible.filsDroit==null && cible.filsGauche==null) {
					//on donne la valeur null au noeud
					         return null;
					}
				else if(cible.filsDroit==null ) {
					// Le nœud à supprimer n'a qu'un seul fils "filsGauche", on relie le fils Gauche  à son père et on supprime  le fils Gaucle .
					   return cible.filsGauche;
					 //  cible.filsGauche=null;
					 //  return cible;
				} 
				else if(cible.filsGauche==null ) {
					// Le nœud à supprimer n'a qu'un seul fils "filsDroit", on relie le fils Droit  à son père et on supprime  le fils Droit .
					//cible= cible.filsDroit;
					//cible.filsDroit = null;
					return cible.filsDroit;
				}
				else {
					/* on chercher son prédécesseur qui est le nœud de clé maximum dans le sous-arbre gauche du nœud
					 */
					// il a deux fils 
					Noeud Prede = Predecesseur(cible.filsGauche);
				// on remplace la valeur du noeud à supprimer avec la valeur du Predecesseur
					cible.couple = Prede.couple;
					// on supprime le prédecesseur
					cible.filsGauche= supprimeR(cible.filsGauche,Prede.couple.getCle());
					//return cible;
				}
				}
			
		}
	 
	return cible;
	       
		
	}

public Noeud Predecesseur(Noeud noeud) {
	// chercher le prédécesseur du noeud
	 Noeud  courant = noeud;
    while(courant.filsDroit != null) {
        courant = courant.filsDroit;}
    return courant;
}
	

	@Override
	public String get(String cle) {
		return getR (racine,cle);
	}
	
	private String getR( Noeud cible,String cle) {
		if (cible == null) {
			return null;
		} else  {
			
				if(cible.couple.getCle().compareTo(cle)<0) {
					//return null;
					return getR( cible.filsDroit,cle);
					}
				else  if(cible.couple.getCle().compareTo(cle)>0) {
						//return null;
					return getR( cible.filsDroit,cle);
					}
				else {
					
					return cible.couple.getValeur();}
				
			}

}}
