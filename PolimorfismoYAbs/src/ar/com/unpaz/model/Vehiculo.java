package ar.com.unpaz.model;

public abstract class Vehiculo {
	private String patente;
	private String marca;
	protected double combustible;

	public Vehiculo(String patente, String marca, double combustible) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.combustible = combustible;
	}
	
	@Override
	public String toString() {
		return "Patente: " + patente + ", Marca: " + marca + ", Combustible despues de avanzar: " + combustible + "\n";
	}

	public abstract void avanzar(int kilometros);

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCombustible() {
		return combustible;
	}

	public void setCombustible(double combustible) {
		this.combustible = combustible;
	} 
	
}
