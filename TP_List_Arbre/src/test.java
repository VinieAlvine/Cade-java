
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtListe a = new AtListe();
		
		
		a.associe("25", "tyu");
		a.associe("26", "olive");
		a.associe("27", "alvine");
		a.associe("28", "cho");
		a.associe("29", "doris");
		a.associe("3", "maurels");
		a.associe("4", "marl");
		a.associe("8", "bis");
		a.supprime("25");
		
		
		
		
		//Paire paire = new Paire("25","doris");
	//	Element e=new Element (paire,null);
		
		System.out.println(a);
		System.out.println(a.get("4"));

	}

}
