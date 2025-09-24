package parcial;

import java.util.Comparator;

public class CalificaiconComparator implements Comparator<Pelicula>{

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		
		return Double.compare(o2.getCalificacion(), o1.getCalificacion());
	}

}
