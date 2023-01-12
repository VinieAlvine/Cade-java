package CM5;

public class TestArbre {

	public static void main(String[] args) {
		/*Noeud olivier = new Noeud("Olivier");
		Noeud quentin = new Noeud("Quentin");
		Noeud mael = new Noeud("Maël");
		Noeud thomas = new Noeud("Thomas");
		
		Noeud ambre = new Noeud("Ambre", olivier, quentin);
		Noeud anaelle = new Noeud("Anaëlle", mael, thomas);
		
		Noeud charly = new Noeud("Charly", ambre, anaelle);*/
		
		ArbreBinaire ab = new ArbreBinaire() ;
		ab.ajoute(null, "Charly");
		ab.ajoute("Charly", "Ambre");
		ab.ajoute("Charly", "Anaëlle");
		ab.ajoute("Ambre", "Olivier");
		ab.ajoute("Ambre", "Quentin");
		ab.ajoute("Anaëlle", "Maël");
		ab.ajoute("Anaëlle", "Thomas");
		
		ArbreBinaire ab2 = new ArbreBinaire() ;
		ab2.ajoute2(null, "Charly");
		ab2.ajoute2("Charly", "Ambre");
		ab2.ajoute2("Charly", "Anaëlle");
		ab2.ajoute2("Ambre", "Olivier");
		ab2.ajoute2("Ambre", "Quentin");
		ab2.ajoute2("Anaëlle", "Maël");
		ab2.ajoute2("Anaëlle", "Thomas");
		
		
		System.out.println(ab);
		
	}

}
