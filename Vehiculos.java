package vehiculo;

public interface Vehiculos {
	//atributos de clase
	static int vehiculosCreados = 0;
	static float kilometrosTotales = 0;
	
	//atributos de instancia
	float kilometrosRecorridos = 0;
	
	public static float getKilometrosTotales() {
		return kilometrosTotales;
	}
	
	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}
}
