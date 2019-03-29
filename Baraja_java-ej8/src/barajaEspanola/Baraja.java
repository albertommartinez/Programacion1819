package barajaEspanola;

import java.util.ArrayList;
import java.util.Collections;

class Baraja {
	ArrayList<Carta> baraja = new ArrayList<Carta>();
	
	Baraja() {
		llenarBaraja();
		barajar();
	}
/**
 * LLena el arrayList baraja, de objetos carta
 * 
 */
	private void llenarBaraja() {
		for(Palo palo : Palo.values()) {//itera la enumeracion que almacena los palos
			for(Figura figura : Figura.values()) {//itera la enumeracion que almacena las figuras
				Carta carta = new Carta(palo,figura);//instancia una carta con la figura y el palo actual en las iteraciones
				baraja.add(carta);//annade el objeto carta al arrayList baraja
			}
		}
		
	}
/**
 * intercambia la posicion de los elementos para desordenarlos
 */
	private void barajar() {
		Collections.shuffle(baraja);
	}
	
/**
 * extrae carta de la baraja	
 * @param indiceElemento
 * @return Carta
 */
	public Carta extraerCarta(int indiceElemento) {
		Carta carta = baraja.get(indiceElemento);
		baraja.add(indiceElemento,null);
		barajar();
		return carta;
	}
	
	public static Carta[] extraerNCartas(Baraja baraja,int CantidadCartas) {
		Carta[] cartas = new Carta[CantidadCartas];
		try {
			for(int i=0;i<CantidadCartas;i++) {
				cartas[i] = baraja.extraerCarta(i);
				System.out.println(cartas[i].toString());
			}
		}catch(Exception e){//si salta la excepcion resetea el vector cartas
			int i=0;
			do {
				cartas[i] = null;
			}while(i<10);
		}
		return cartas;
	}
}
