
public class Noeud {
	

		Paire couple;
		Noeud filsGauche;
		Noeud filsDroit;
		
		public Noeud(Paire couple) {
			this.couple = couple;
			filsGauche = filsDroit = null;
		}
		
		public Noeud(Paire couple, Noeud filsGauche, Noeud filsDroit) {
			this.couple = couple;
			this.filsGauche = filsGauche;
			this.filsDroit = filsDroit;
		}
		
	}

