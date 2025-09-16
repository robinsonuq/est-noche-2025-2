package generics;

public class ArrayList<E> {

	E [] lista;
	int index;
	
	
	public void add(E e) {
		lista[index] = e;
		index++;
	}
	
	
}
