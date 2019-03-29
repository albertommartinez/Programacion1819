package numeros;

import java.util.ArrayList;


class ArrayListAleatorio {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int longitud = Matematicas.generarEnteroAleatorio(10,20);
		
		for(int i=0;i<longitud;i++) {
			int aleatorio = Matematicas.generarEnteroAleatorio(0,100);
			lista.add(aleatorio);
			System.out.println(lista.get(i));
		}
		System.out.println("Suma: "+Matematicas.sumaArrayList(lista));
		System.out.println("Media: "+Matematicas.mediaArrayList(lista));
		System.out.println("Maximo: "+Matematicas.maximo(lista));
		System.out.println("Minimo: "+Matematicas.minimo(lista));
	}

}
