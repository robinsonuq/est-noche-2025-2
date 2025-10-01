package banco;

import java.util.Iterator;
import java.util.Random;

import cola.Cola;

public class Banco {
	
	Cola<Cliente> clientes = new Cola<>();
	
	public Cliente atenderCliente() {
		
		Cliente clienteAtendido = clientes.desencolar();
		System.out.println("Se atiende al cliente "+clienteAtendido.getNombre());
		return clienteAtendido;
	}
	
	public void ingresarCliente(Cliente cliente) {
		clientes.encolar(cliente);
		System.out.println("Ingreso el cliente "+cliente.getNombre());
	}
	
	public void iniciarOperacionesFinancieras() {
		
		System.out.println("Se abre el Banco");
		
		for (int i = 0; i < 10; i++) {
			int edad = 20 +(int) (Math.random()*101);
			Cliente cliente = new Cliente("Cliente "+i,edad);
			ingresarCliente(cliente);
		}
		
//		while(clientes.getTamanio() != 0) {
//			
//			atenderCliente();
//			
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		atenderClienteMayor40();
	}

	private Cola<Cliente> atenderClienteMayor40() {
		
		Cola<Cliente> clientesMayores40 = new Cola<>();
		Cola<Cliente> colaAux2 = new Cola<>();
		
		while(clientes.getTamanio() != 0) {
			Cliente cliente = clientes.desencolar();
			if(cliente.getEdad() < 40) {
				colaAux2.encolar(cliente);
			}else {
				clientesMayores40.encolar(cliente);
			}
		}
		
		while(clientesMayores40.getTamanio() != 0) {
			clientes.encolar(clientesMayores40.desencolar());
		}
		
		 clientes = colaAux2;

		return clientesMayores40; 
	}
	
	
}
