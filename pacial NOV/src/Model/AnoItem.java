package Model;

import java.util.Comparator;

public class AnoItem implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getAno().compareTo(o2.getAno());
	}
	
	
	

}