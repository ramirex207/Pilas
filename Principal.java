package Pilas;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner Leer = new Scanner(System.in);
		Pila pilosa= new Pila();
		int op;
		Operaciones oper = new Operaciones();
		do {
		System.out.println("*******************************");
		System.out.println("***********Pilas************ \n\n");
		System.out.println("1. Insertar N elementos a la Pila");
		System.out.println("2. Mostrar elementos de la Pila");
		System.out.println("3. Eliminar elemento de la cima");
		System.out.println("0. SALIR");
		op=Leer.nextInt();
		
	        switch(op) {
				case 1:
					oper.insertarN(pilosa); 
					break; 
				case 2:		
					oper.mostrar(pilosa);
					break;
				case 3:
					oper.eliminarUltimo(pilosa);
					break;
			
		        }
		}while(op!=0);
	}
}
