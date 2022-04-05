package Pilas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pilosa= new Pila();
		Operaciones oper = new Operaciones();
		oper.insertarN(pilosa);
		oper.mostrar(pilosa);
		oper.eliminarUltimo(pilosa);
		oper.mostrar(pilosa);
	}
}
