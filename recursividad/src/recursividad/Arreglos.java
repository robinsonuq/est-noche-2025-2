package recursividad;

public class Arreglos {

	public static void main(String[] args) {
		int [] numeros = {1,2,3,4,5,6};
		int suma = imprimirArreglo(numeros,0);
		System.out.println(suma);
	}

	private static int imprimirArreglo(int[] numeros,int i) {
		
		if(i < numeros.length) {
			return numeros[i]+ imprimirArreglo(numeros, i+1);
		}
		return 0;
	}
	
	
	
}
