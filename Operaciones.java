package Pilas;
import java.util.Scanner;
public class Operaciones {
	public Pila insertarN(Pila PL) {
		Scanner Leer = new Scanner(System.in);
		int dato;
		int nel;
		System.out.println("ingrese tamaño de la pila");
		nel= Leer.nextInt();
		for (int i=1 ; i<=nel ; i++) {
				System.out.println("dato "+i+" :");
				dato= Leer.nextInt();
				PL.insertar(dato);
		}
	return PL;
	}
	public Pila mostrar(Pila pl) {
		//crear la pila auxiliar
		Pila pila_aux= new Pila();
		int d;
		//vaciar pl en pila aux
		while(!pl.pilaVacia()) {
			d=pl.ver();
			System.out.println(d);
			pl.eliminar();
			pila_aux.insertar(d);
		}
		while (!pila_aux.pilaVacia()) {
			d=pila_aux.ver();
			pila_aux.eliminar();
			pl.insertar(d);
		}
		return pl;
	}
	public Pila eliminarUltimo(Pila pl) {
		Pila pila_aux1= new Pila();
		if(!pl.pilaVacia()) {
			pl.eliminar();
		}
		return pl;
	}
}
