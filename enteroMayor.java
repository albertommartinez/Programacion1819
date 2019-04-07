package excepcionesEjericicio1;
import java.util.Scanner;

class enteroMayor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[6];
		int i = 0;
		
		do {
			try {
				System.out.println("Introduce un valor entero> ");
				numeros[i] = teclado.nextInt();
			}catch(Exception e){
				System.out.println("Introduce un valor entero> ");
				numeros[i] = teclado.nextInt();
			}
			i++;
		}while(i<6);

	}

}
