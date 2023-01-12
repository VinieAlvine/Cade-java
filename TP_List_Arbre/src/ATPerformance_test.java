import java.util.*;
public class ATPerformance_test {
        static final double n =1000000000.0;
        static double N = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // LES LISTES
		// methode associe;
		AtListe liste = new AtListe();
		long startTime = System.nanoTime();
		for(int i=0;i<=N;i++) {
             liste.associe(Integer.toString(((int) (Math.random() * N))), Integer.toString(((int) (Math.random() * 100000))));
             }
		double estimatedTime =( (double)(System.nanoTime() - startTime))/n;
		System.out.println("le temps d'exécusion de la methode Associe pour les listes    "+estimatedTime);

		// methode get
	    AtListe liste_get = new AtListe();
		long startTime_get = System.nanoTime();
		for(int i=0;i<=N;i++) {
			liste_get.get(Integer.toString((int) (Math.random() * N)));
		}
		double estimatedTime_get =((double) (System.nanoTime() - startTime_get))/n;
    	System.out.println("temps d'excusion de la methode get  pour les listes      "+estimatedTime_get);
// LES ARBRES BINAIRES DE RECHERCHE
    	// methode associe
		ATTree arbre = new ATTree();
		long arbre_start = System.nanoTime();
		for(int i=0;i<=N;i++) {
			arbre.associe(Integer.toString((int) (Math.random() *N)), Integer.toString((int) (Math.random() * 100000)));
		}
		double arbre_est = ((double)System.nanoTime() - arbre_start)/n;
		System.out.println("temps d'excusion de la methode Associe pour les arbres      "+arbre_est);
        // methode get
		ATTree arbre_get = new ATTree();
		long arbre_startget = System.nanoTime();
		for(int i=0;i<=N;i++) {
			arbre.get(Integer.toString((int) (Math.random() * N)));
		}
		double arbre_estget = ((double)System.nanoTime() - arbre_startget)/n;
		System.out.println("temps d'excusion de la methode get pour les arbres    "+arbre_estget);


		
	}

}
