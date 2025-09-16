package comparadores;

import java.util.Comparator;

public class CedulaComparator implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		
		return o1.getCedula().compareTo(o2.getCedula());
	}

	
	
	
	
	
}
