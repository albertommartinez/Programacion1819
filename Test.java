package vehiculo;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Coche coche = new Coche();//instancia objeto tipo Coche
		Bicicleta bicicleta = new Bicicleta();//instancia objeto tipo Bicicleta
		Scanner Teclado = new Scanner(System.in);//crea objeto teclado
		int opcion = 0;
		
		do {
			System.out.println("VEHICULOS");
			System.out.println("=========");
			System.out.println("1.Anda con la bicicleta");
			System.out.println("2.Haz el caballito con la bicicleta");
			System.out.println("3.Anda con el coche");
			System.out.println("4.Quema rueda con el coche");
			System.out.println("5.Ver Km de la bicicleta");
			System.out.println("6.Ver Km del coche");
			System.out.println("7.Ver kilometraje total");
			System.out.println("8.Salir");
			System.out.println("Elige opcion(1-8):");
			opcion = Teclado.nextInt();
		}while((opcion<1)||(opcion>8));
		
		switch(opcion) {
		case 1:
			bicicleta.andar();
			break;
		case 2:
			bicicleta.caballito();
			break;
		case 3:
			coche.andar();
			break;
		case 4:
			coche.quemarRueda();
			break;
		case 5:
			bicicleta.getKilometraje();
			break;
		case 6:
			coche.getKilometraje();
			break;
		case 7:
			System.out.print("Kilometraje Total: "+(coche.getKilometraje()+bicicleta.getKilometraje()));
		}

	}

}
