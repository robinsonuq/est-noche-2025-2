package recursividad;

public class Parametros {

	
	public static void main(String[] args) {
		
		Persona persona = new Persona();
		persona.setNombre("Robinson");
		persona = cambiarNombre(persona);	
		System.out.println(persona.getNombre());
		
		int a = 6;
		sumar(a);
	}

	private static void sumar(int a) {
		a = a*5;
	}

	private static Persona cambiarNombre(Persona persona) {
		persona.setNombre("Maria");
		persona.setNombre("Luis");
		return persona;
	}

}
