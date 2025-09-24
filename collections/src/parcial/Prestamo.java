package parcial;

import java.time.LocalDate;

public class Prestamo<K,V> {

	private K id;
	private V material;
	private LocalDate fechaDevolucion;
	
	
	public Prestamo(K id, V material) {
		super();
		this.id = id;
		this.material = material;
	}
	public K getId() {
		return id;
	}
	public void setId(K id) {
		this.id = id;
	}
	public V getMaterial() {
		return material;
	}
	public void setMaterial(V material) {
		this.material = material;
	}
	
	
}
