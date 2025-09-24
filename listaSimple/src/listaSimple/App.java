package listaSimple;

public class App {

	
	public static void main(String[] args) {
		
		ListaSimple lista1 = new ListaSimple();
		
		lista1.agregarInicio(5);// lista.addFirst();
		lista1.agregarInicio(4);
		lista1.eliminar(5);
		
		System.out.println(lista1.print());
		
	}
}
