package parcial;

import java.util.Comparator;

public class EstrenoComparator implements Comparator<Pelicula>{

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		
		return Integer.compare(o2.getAnio(), o1.getAnio());
	}

}
