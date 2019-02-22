package tiempo;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		
		int hh = 0;
		int mm = 0;
		int ss = 0;
		Scanner Teclado = new Scanner(System.in);
		
		System.out.print("Valor de las horas> ");
		hh = Teclado.nextInt();
		System.out.print("Valor de los minutos> ");
		mm = Teclado.nextInt();
		System.out.print("Valor de los segundos> ");
		ss = Teclado.nextInt();
		
		Tiempo tiempo = new Tiempo(hh,mm,ss);
		
		System.out.print("Valor a sumar a las horas> ");
		hh = Teclado.nextInt();
		System.out.print("Valor a sumar a los minutos> ");
		mm = Teclado.nextInt();
		System.out.print("Valor a sumar a los segundos> ");
		ss = Teclado.nextInt();
		
		tiempo.sumar(hh, mm, ss);
		System.out.print("Resultado de la suma: "+tiempo.toString());
		
		
		
	}

}
