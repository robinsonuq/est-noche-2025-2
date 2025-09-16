package collections.ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import collections.clases.Cliente;
import collections.clases.Persona;

public class EjemplosMaps {

	public static void main(String[] args) {
		
//		ejemplo1_HashMap();
		ejemplo2_HashMap();
//		ejemploProductos();

	}



	private static void ejemplo1_HashMap() {
		
		// Definir un HashMap
		HashMap<String, String> datos = new HashMap();

		
		HashMap<Integer, ArrayList<Cliente>> clientesSinPago = new HashMap();
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente());
		clientesSinPago.put(1,clientes);
		
	
		ArrayList<Cliente> arrayList = clientesSinPago.get(1);
		
		
		// Insertar valores "key"-"value" al HashMap
		datos.put("Laura", "1");
		datos.put("Laura", "2");
		datos.put("Abelardo", "3");
		datos.put("Daniel", "4");
		datos.put("Arturo", "5");
		
		// Definir Iterator para extraer o imprimir valores 
		for( Iterator it = datos.keySet().iterator(); it.hasNext();) { 
			
			String s = (String)it.next();
			String s1 = (String)datos.get(s);
			System.out.println("Alumno: "+s + " - " + "Telefono: "+s1);
		}
		
		
		for (Iterator it = datos.values().iterator(); it.hasNext();) {
			
			String s = (String)it.next();
			String s1 = (String)datos.get(s);
			System.out.println("Alumno: "+s + " - " + "Telefono: "+s1);
		}
	
	}
	
	
	private static void ejemplo2_HashMap() {
		
		Map <Integer,Persona> mp = new HashMap<Integer,Persona>();

        Persona p = new Persona(4,"Mar�a",167);

        mp.put(4, p); // A�adimos un objeto persona al map

        p = new Persona(1,"Marta",165);

        mp.put(1, p); // A�adimos un objeto persona al map

        p = new Persona(3,"Elena",185);

        mp.put(3, p); // A�adimos un objeto persona al map

        p = new Persona(2,"Yolanda",174);

        mp.put(2, p); // A�adimos un objeto persona al map

        p = new Persona(5,"Mar�a Dolores",169);

        mp.put(3, p); // Esto crea una colisi�n �Dos objetos no pueden tener la misma clave!

        System.out.println("Personas en el mapa: \n"+mp.toString().replaceAll(",", "\n"));
		
	}
	
	
	
	
	
	
	
	private static void ejemploProductos() {
		HashMap<String,Float> listaProductos = new HashMap<String,Float>();
	    Scanner sc = new Scanner(System.in);
	    int opcionElegida = 0;
	    float precio;
	    String codigo;

	    while (opcionElegida != 5) {
	        System.out.println("Introduce el numero de la opci�n que quieras:");
	        System.out.println("1.- Introducir producto");
	        System.out.println("2.- Modificar precio");
	        System.out.println("3.- Mostrar todos los productos");
	        System.out.println("4.- Eliminar producto");
	        System.out.println("5.- Salir");
	        opcionElegida = sc.nextInt();

	        switch (opcionElegida) {
	            case 1:
	                System.out.println("Introduce el c�dido del producto:");
	                codigo = sc.next();
	                System.out.println("Introduce el precio del producto:");
	                precio = sc.nextFloat();
	                guardarProducto(codigo, precio, listaProductos);
	                break;
	            case 2:
	                System.out.println("Introduce el c�dido del producto del que quieres cambiar el precio:");
	                codigo = sc.next();
	                modificaPrecio(codigo, listaProductos);
	                break;
	            case 3:
	                mostrarProductos(listaProductos);
	                break;
	            case 4:
	                System.out.println("Introduce el c�dido del producto que quieres eliminar:");
	                codigo = sc.next();
	                eliminaProducto(codigo, listaProductos);
	                break;
	            case 5:
	                break;   // Si la opcion es 5 no se hace nada 
	            default:
	                System.out.println("Tienes que introducir una opci�n valida");
	        }

	    }
		
	}
	
	public static void guardarProducto(String codigo, float precio, HashMap <String,Float> listaProductos){
	    if (listaProductos.containsKey(codigo)) {
	        System.out.println("No se puede introducir el producto. El c�digo esta repetido.");
	    } else {
	        listaProductos.put(codigo, precio);               
	    }
	}
	
	
	public static void modificaPrecio(String codigo, HashMap<String,Float> listaProductos){
	    Scanner sc = new Scanner(System.in);
	    if (listaProductos.containsKey(codigo)) {
	        System.out.println("Introduce el precio del producto:");
	        listaProductos.put(codigo, sc.nextFloat());            
	    } else {
	        System.out.println("No hay ningun producto con ese c�digo.");
	    }
	}
	
	public static void mostrarProductos(HashMap<String, Float> listaProductos) {
	    String clave;
	    Iterator<String> productos = listaProductos.keySet().iterator();
	    System.out.println("Hay los siguientes productos:");
	    while(productos.hasNext()){
	        clave = productos.next();
	        System.out.println(clave + " - " + listaProductos.get(clave));
	    }        
	}
	
	
	public static void eliminaProducto(String codigo, HashMap<String,Float> listaProductos) {
	    if (listaProductos.containsKey(codigo)) {
	        listaProductos.remove(codigo);
	    } else {
	        System.out.println("No hay ningun producto con ese c�digo.");  
	    }       
	} 
	
	
	
	
	
	

}
