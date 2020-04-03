package Model;

import java.util.Comparator;

public class NombreItem implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getNom().compareTo(o2.getNom());
	}
	

}
