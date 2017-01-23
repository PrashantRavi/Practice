package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TVComparater implements Comparator<HDTV>{

	@Override
	public int compare(HDTV o1, HDTV o2) {
		if(o1.getBrand().compareTo(o2.getBrand())>1){
			return 1;
		}else if(o1.getBrand().compareTo(o2.getBrand())<1){
			return -1;
		}
		else
		return 0;
	}
	
}

public class ComparaterExample {

	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
		HDTV tv3 = new HDTV(42, "Panasonic");
		ArrayList<HDTV>al=new ArrayList<HDTV>();
		
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
		
		Collections.sort(al,new TVComparater());
		for (HDTV a : al) {
			System.out.println(a.getBrand());
		}

	}

}
