package listaSimple;

import java.util.Iterator;

public class ListaSimple implements Iterable<Integer> {

	
	private int tamanio;
	private Nodo nodoPrimero;
	
	
	public ListaSimple() {
		super();
		this.tamanio = 0;
		this.nodoPrimero = null;
	}


	public int getTamanio() {
		return tamanio;
	}


	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}


	public Nodo getNodoPrimero() {
		return nodoPrimero;
	}


	public void setNodoPrimero(Nodo nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}


	public void agregarInicio(int valor) {
		
		Nodo nuevoNodo = new Nodo(valor);
		
		if(estaVacia()) {
			nodoPrimero = nuevoNodo;
		}else {
			nuevoNodo.setSiguiente(nodoPrimero);
			nodoPrimero = nuevoNodo;
		}
		
		tamanio++;
	}
	
	public void eliminar(int valor) {
		if (nodoPrimero==null) {
			return;
		}
		if(nodoPrimero.getValor() == valor) {
			nodoPrimero=nodoPrimero.getSiguiente();
			return;
		}
		Nodo actual = nodoPrimero;
		while(actual.getSiguiente()!= null && actual.getSiguiente().getValor()!=valor) {
			actual=actual.getSiguiente();
		}
		if(actual.getSiguiente()!=null) {
			actual.setSiguiente(actual.getSiguiente().getSiguiente());
		}
	}
	
	public String print() {
		
		String lista = "";
		
		// i = 0;  i < arreglo.length;                            i++;
		for(Nodo aux = nodoPrimero; aux != null;aux = aux.getSiguiente() ) {
			lista += aux.getValor() + " ->";
		}
		
		return lista;
		
		
	}

	public void imprimirArreglo1(int arreglo[]) {
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
	
	public void imprimirArreglo(int arreglo[]) {
		imprimirArreglo(arreglo, 0);
	}
	
	 public void imprimirArreglo(int arreglo[], int i) {
		 
		 if(i < arreglo.length) {
			 System.out.println(arreglo[i]);
			imprimirArreglo(arreglo, i + 1);
		 }else {
			 System.out.println("Termine");
		 }
		 
	 }
	 
	 public void imprimirArreglo3(int arreglo[], int i) {
		 
		 if(i == arreglo.length) {//
			System.out.println("Termino");
		 }else {
			 System.out.println(arreglo[i]);
			imprimirArreglo(arreglo, i + 1); 
		 }
		 
	 }
	

public void agregarFinal(int valor) {
		
		Nodo nuevoNodo = new Nodo(valor);
		
		if(estaVacia()) {
			nodoPrimero = nuevoNodo;
		}else {
			
			Nodo aux = nodoPrimero;
			while(aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevoNodo);
		}
		
		tamanio++;
	}

	private boolean estaVacia() {
		// TODO Auto-generated method stub
		return tamanio == 0;
	}


	@Override
	public Iterator<Integer> iterator() {
		
		return new ListaSimpleIterador(nodoPrimero);
	}
	
	
	
}
