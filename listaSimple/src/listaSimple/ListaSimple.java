package listaSimple;

public class ListaSimple {

	
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
	
	
	
}
