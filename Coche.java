package vehiculo;

class Coche implements Vehiculos {
	float kilometrosRecorridos;
	
	Coche() {
		this.kilometrosRecorridos = 0;
	}
	
	public void andar() {
		System.out.print("Soy un coche y estoy andando");
		kilometrosRecorridos++;
	}
	public void quemarRueda() {
		System.out.print("Quemando rueda, huele a quemado");
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
