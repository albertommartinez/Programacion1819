package coleccionDiscos;
import java.util.Scanner;

public class Coleccion {
	//instanciacion del vector de tipo Disco
	Disco[] discos = new Disco[10];
	Scanner teclado = new Scanner(System.in);//instancia el objeto Scanner
/**
 * Pinta un menu de seleccion y devuelve
 * la eleccion, la lista de opciones es pasada
 * por parametro en un array
 * @param opciones String[]
 * @return int
 */
	public int pintarMenu(String[] opciones) {
		int opcion = 0;
		int n = opciones.length;
		
		System.out.println("------------------------");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+"."+opciones[i]);
		}
		System.out.println("------------------------");
		System.out.print("> ");
		opcion = teclado.nextInt();
		return opcion;
	}
	
	public void mostrarColeccion() {
		for(int i=0;i<discos.length;i++) {
			System.out.println(discos[i].getTitulo()+"-"+discos[i].getAutor());
		}
	}
/**
 * annade un disco a la coleccion(vector)	
 * @param posicion int
 * @return int 0, correcto.1, posicion inexistente.2, posicion ocupada.3, error desconocido
 */
	public int annadir(Disco disco,int posicion) {
		if((posicion>(discos.length-1))||(posicion<0)){//si posicion no existe
			return 1;
		}else if(discos[posicion]!=null) {//si posicion ocupada
			return 2;
		}else if(discos[posicion]==null) {//correcto
			discos[posicion] = disco;
			return 0;
		}
		return 3;//error desconocido
	}
/**
 * annade un disco en la primera posicion libre	
 * @param disco
 * @return int 0, correcto.1, posiciones ocupadas
 */
	public int annadir(Disco disco) {
		for(int i=0;(i<discos.length)&&(discos[i]==null);i++) {
			this.annadir(disco,i);
			return 0;//correcto
		}
		return 1; //posiciones ocupada
		
	}
/**
 * borra elemento de la posicion 
 * indicada por parametro	
 * @param posicion
 * @return boolean
 */
	public int borrar(int posicion) {
		if((posicion<0)||(posicion>discos.length)) {
			this.annadir(null,posicion);
			return 0;//correcto
		}
		return 1;//error
	}
/**
 * Devuelve elemento correspondiente
 * al indice pasado por parametro	
 * @param posicion int
 * @return Disco
 */
	public Disco obtener(int posicion) {
		return discos[posicion];
	}
}
