package parcial;

import java.util.HashMap;
import java.util.Map;

public class GestorPrestamos<K, V> {

	
	Map<String,Prestamo<K, V> > listaPrestamos = new HashMap<>();
	
	
	public void agregar(String id,Prestamo<K, V>prestamo) {
		listaPrestamos.put(id, prestamo);
	}
	
	public Prestamo<K, V> buscar(String id){
		return listaPrestamos.get(id);
	}
}
