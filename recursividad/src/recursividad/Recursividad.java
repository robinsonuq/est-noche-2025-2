package recursividad;

public class Recursividad {


	public static void main(String[] args) {

		int arreglo[] = {1,2,3,4,5};

//		matriuska(10);
		int resultado = sumarRecursivo(5);
		System.out.println(resultado);
	}

	private static void imprimirArreglo(int[] arreglo) {

		//inicio
		//condicion de parada
		//incremento
		//for
		//ciclos infinitos

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("El numero es :"+arreglo[i]);
		}
	}

	private static void imprimirArregloRecursivo(int[] arreglo,int i) {

		//inicio
		//condicion de parada
		//incremento avance
		//for
		//ciclos infinitos

		// caso base
		if(i == arreglo.length) {
			System.out.println("Termine");
		}else{
			imprimirArregloRecursivo(arreglo, i + 1);
			System.out.println("El numero es :"+arreglo[i]);

		}
	}

	private static void matriuska(int n) {

		//inicio
		//condicion de parada
		//incremento avance
		//for
		//ciclos infinitos

		// caso base
		if(n == 0) {
			System.out.println("Termine");
		}else{
			System.out.println("Abriendo matriuska "+ n);
			matriuska(n - 1);
			System.out.println("Cerrando matriuska "+ n);

		}
	}

	public static int sumar(int n) {
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}
	
	//int resultado = sumarRecursivo(5);
	//System.out.println(resultado);
	
	public static int sumarRecursivo(int n) {
		if(n == 0) {
			return 0;
		}else {
			return  n + sumarRecursivo(n - 1);
		}
	}
	

}
