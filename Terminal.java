package terminal;

class Terminal {
	private String numero = " ";
	static private int segundosConversacion;
	
	Terminal(String numero) {
		setNumero(numero);
		setSegundosConversacion(0);
	}
	
	public void llamar(Terminal t,int tiempo) {
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public static int getSegundosConversacion() {
		return segundosConversacion;
	}

	public static void setSegundosConversacion(int segundosConversacion) {
		Terminal.segundosConversacion = segundosConversacion;
	}

	@Override
	public String toString() {
		return "Terminal [numero=" + numero + "]";
	}
	
	
}
