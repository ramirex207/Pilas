package Pilas;

public class Pila {
	int cima;
	int []elem;
	final int max =50;
	//constructor
	public Pila () {
		cima = 0;
		elem = new int [max+1];
	}
	//inicializando la cima
	public void inicializar() {
		cima = 0;
	}
	//Verificar si la pila esta vacia
	public boolean pilaVacia() {
		return cima == 0;
	}
	//verificar si la pila esta llena
	public boolean pilaLLena() {
		return cima >=elem.length;
	}
	public void eliminar() {
		if (!pilaVacia()) {
			--cima;
		}
	}
	public void insertar(int x) {
		if (!pilaLLena()) {
			++cima;
			elem[cima]=x;
		}
	}
	public int ver() {
		 return elem[cima];
	}

}
