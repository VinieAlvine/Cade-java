package CM5;

public class TestArbre {

	public static void main(String[] args) {
		/*Noeud olivier = new Noeud("Olivier");
		Noeud quentin = new Noeud("Quentin");
		Noeud mael = new Noeud("Ma�l");
		Noeud thomas = new Noeud("Thomas");
		
		Noeud ambre = new Noeud("Ambre", olivier, quentin);
		Noeud anaelle = new Noeud("Ana�lle", mael, thomas);
		
		Noeud charly = new Noeud("Charly", ambre, anaelle);*/
		
		ArbreBinaire ab = new ArbreBinaire() ;
		ab.ajoute(null, "Charly");
		ab.ajoute("Charly", "Ambre");
		ab.ajoute("Charly", "Ana�lle");
		ab.ajoute("Ambre", "Olivier");
		ab.ajoute("Ambre", "Quentin");
		ab.ajoute("Ana�lle", "Ma�l");
		ab.ajoute("Ana�lle", "Thomas");
		
		ArbreBinaire ab2 = new ArbreBinaire() ;
		ab2.ajoute2(null, "Charly");
		ab2.ajoute2("Charly", "Ambre");
		ab2.ajoute2("Charly", "Ana�lle");
		ab2.ajoute2("Ambre", "Olivier");
		ab2.ajoute2("Ambre", "Quentin");
		ab2.ajoute2("Ana�lle", "Ma�l");
		ab2.ajoute2("Ana�lle", "Thomas");
		
		
		System.out.println(ab);
		
	}

}
