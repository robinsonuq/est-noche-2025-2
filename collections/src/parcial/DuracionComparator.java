package parcial;

import java.util.Comparator;

public class DuracionComparator implements Comparator<Pelicula>{

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		
		return Integer.compare(o1.getDuracion(), o2.getDuracion());
	}

}
