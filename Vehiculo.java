package vehiculo;

	class Vehiculo implements Vehiculos{
		//atributos de clase
		static int vehiculosCreados = 0;
		static float kilometrosTotales = 0;
		
		//atributos de instancia
		float kilometrosRecorridos = 0;
			
			Vehiculo() {
				this.kilometrosRecorridos = 0;
			}
			
			public void andar() {
				System.out.print("Soy un coche y estoy andando");
				kilometrosRecorridos++;
			}
			
			public void getKilometraje() {
				System.out.print(kilometrosRecorridos+" Km recorridos");
			}
			public static float getKilometrosTotales() {
				return kilometrosTotales;
			}
			
			public static int getVehiculosCreados() {
				return vehiculosCreados;
			}
	}
