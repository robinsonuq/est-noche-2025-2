package cola;

import java.util.Iterator;

public class Cola<T> {


	private int tamanio;
	private Nodo<T> nodoPrimero;
	private Nodo<T> nodoUltimo;


	public Cola() {
		super();
		this.tamanio = 0;
		this.nodoPrimero = null;
		this.nodoUltimo = null;
	}


	public int getTamanio() {
		return tamanio;
	}


	private Nodo<T> getNodoPrimero() {
		return nodoPrimero;
	}


	public void setNodoPrimero(Nodo nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}


	public String print() {
		String lista = "";
		// i = 0;  i < arreglo.length;                            i++;
		for(Nodo<T> aux = nodoPrimero; aux != null;aux = aux.getSiguiente() ) {
			lista += aux.getValor() + " ->";
		}
		return lista;
	}


	public T desencolar() {
		T valor = null;
		
		if(!estaVacia()) {
			valor = nodoPrimero.getValor();
			nodoPrimero = nodoPrimero.getSiguiente();
			if(nodoPrimero == null) {
				nodoUltimo = null;
			}
			tamanio--;
		}else {
			throw new RuntimeException("Cola vacia");
		}
		
		return valor;
	}

	public void encolar(T valor) {
		Nodo<T> nuevoNodo = new Nodo<T>(valor);
		if(estaVacia()) {
			nodoPrimero = nuevoNodo;
			nodoUltimo = nuevoNodo;
		}else {
			nodoUltimo.setSiguiente(nuevoNodo);
			nodoUltimo = nuevoNodo;
		}
		tamanio++;
	}

	private boolean estaVacia() {
		// TODO Auto-generated method stub
		return tamanio == 0;
	}
	
	public void limpiar() {
		nodoPrimero = null;
		nodoUltimo = null;
		tamanio = 0;
	}

	
	public Cola<T> clone(){
		
		Cola<T> clone = new Cola<>();
		Nodo<T> aux = nodoPrimero;
		
		while(aux != null) {
			clone.encolar(aux.getValor());
			aux = aux.getSiguiente();
		}
		return clone;  
	}


}
