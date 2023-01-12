package fr.istic.prg1.list.util;

import java.util.ArrayList;

import fr.istic.prg1.list_util.Iterator;
import fr.istic.prg1.list_util.SuperT;

public class List<T extends SuperT> {
	// liste en double chainage par references

	private class Element {
		// element de List<Item> : (Item, Element, Element)
		public T value;
		public Element left, right;

		public Element() {
			value = null;
			left = null;
			right = null;
		}
	} // class Element

	public class ListIterator implements Iterator<T> {
		private Element current;
        
		private ListIterator() {
			this.current=flag.right;
		}

		@Override
		public void goForward() {
			this.current=this.current.right;//se positionner l'élément courant sur l'élément de droit
		}

		@Override
		public void goBackward() { 
			this.current=this.current.left;//se positionner l'élément courant sur l'élément de gauche
		}

		@Override
		public void restart() {//se positionner l'élément courant sur l'élément de tete 
           this.current= flag.right;//l'élément de tete est le voisin droit du flag  
		}

		/** on compare l'élément courant au flag 
		 * */
          @Override
          public boolean isOnFlag() { 
        	  return this.current ==flag; // on est sur le drapeau si current est égal au flag
          }

		@Override
		public void remove() {
			try {
				assert current != flag : "\n\n\nimpossible de retirer le drapeau\n\n\n";
				Element leftNeighbour = current.left;
				Element rightNeighbour = current.right;
				leftNeighbour.right=rightNeighbour ;
				rightNeighbour.left=leftNeighbour;
				current=rightNeighbour;
			} catch (AssertionError e) {
				e.printStackTrace();
				System.exit(0);
			}
		}

		@Override		 
		public T getValue() { 
			return this.current.value; }

		@Override
	        public T nextValue() { 
			this.current=this.current.right;//se positionner l'élément courant sur l'élément de droit
			return this.current.value; // afficher la valeur
			}

		@Override
		public void addLeft(T v) { 
			Element newElement = new Element();
			newElement.value=v;
			newElement.left=current.left;
			newElement.right=current;
			this.current.left.right=newElement;
			this.current.left=newElement;
			this.current=newElement;
		//	newElement.left =
		}

		@Override
		public void addRight(T v) {
			this.goForward();
			this.addLeft(v);
		}

		@Override
		public void setValue(T v) {
			this.current.value=v;//affecter la valeur v à l’élément courant de la liste
		}

		@Override
		public void selfDestroy() { 
			flag.right=null;
		}

		@Override
		public String toString() {
			return "parcours de liste : pas d'affichage possible \n";
		}

	} // class IterateurListe

	private Element flag;

	private ArrayList<ListIterator> itList = new ArrayList<>();
    
	public List() { 
		this.flag = new Element();
		this.flag.left =this.flag;
		this.flag.right=this.flag;
	}

	public ListIterator iterator() { 
		return new ListIterator();
		}
	public boolean isEmpty() { 
		return this.flag.right==this.flag ; 
		} 

	public void clear() { 
		this.flag.left=this.flag;
		this.flag.right=this.flag;
	}

	public void setFlag(T v) { 
		this.flag.value=v;
	}

	public void addHead(T v) { 
		Element tetelist=new Element();
		 tetelist.value=v;
		 tetelist.right=this.flag.right;
		 tetelist.left=this.flag;
		 this.flag.right.left=tetelist;
		 this.flag.right=tetelist;
	}

	public void addTail(T v) { 
		Element queulist=new Element();
		queulist.value=v;
		queulist.left=this.flag.left;
		queulist.right=this.flag;
		 this.flag.left.right=queulist;
		 this.flag.left=queulist;
	}

	@SuppressWarnings("unchecked")
	public List<T> clone() {
		List<T> nouvListe = new List<T>();
		ListIterator p = iterator();
		while (!p.isOnFlag()) {
			nouvListe.addTail((T) p.getValue().copyOf());
			// UNE COPIE EST NECESSAIRE !!!
			p.goForward();
		}
		p.selfDestroy();
		return nouvListe;
	}

	@Override
	public String toString() {
		String s = "contenu de la liste : \n";
		ListIterator p = iterator();
		while (!p.isOnFlag()) {
			s = s + p.getValue().toString() + " ";
			p.goForward();
		}
		p.selfDestroy();
		return s;
	}
}
