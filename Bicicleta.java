package vehiculo;

class Bicicleta implements Vehiculos {
	float kilometrosRecorridos;
	
	Bicicleta() {
		kilometrosRecorridos = 0;
	}
	
	public void andar() {
		System.out.print("Soy una bici y estoy andando");
		kilometrosRecorridos++;
	}
	
	public void caballito() {
		System.out.print("Soy una bici y estoy haciendo un caballito");
	}
	
	public float getKilometraje() {
		return kilometrosRecorridos;
	}
	public static float getKilometrosTotales() {
		return kilometrosTotales;
	}
	
	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}
}
