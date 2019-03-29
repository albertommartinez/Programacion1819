package barajaEspanola;

class Carta {
	Figura figura;
	Palo palo;
	
	Carta(Palo palo,Figura figura) {
		setFigura(figura);
		setPalo(palo);
	}
	
	
	public Figura getFigura() {
		return figura;
	}

	public void setFigura(Figura figura) {
		this.figura = figura;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}


	@Override
	public String toString() {
		return  figura + ", " + palo;
	}

	
	
}
