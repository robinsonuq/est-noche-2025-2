package parcial;

import java.util.HashMap;
import java.util.Iterator;

public class Universidad {

	HashMap<String, Double> notas = new HashMap<>();
	
	
	
	public double calcularPromedio() {
		
		return calcularPromedio(notas.keySet().iterator())/notas.size();
	}



	private double calcularPromedio(Iterator<String> iterator) {

		if(!iterator.hasNext()) {
			return 0;
		}else {
			
			double  valor = notas.get(iterator.next());
			return valor + calcularPromedio(iterator);
		}
	}
	
	
	
	public int sumar(int arreglo[],int indice) {
		if(indice == arreglo.length) {
			return 0;
		}else {
			return arreglo[indice] + sumar(arreglo, indice + 1);
		}
		
	}
	
	
	
	
	
	
	
	
}
