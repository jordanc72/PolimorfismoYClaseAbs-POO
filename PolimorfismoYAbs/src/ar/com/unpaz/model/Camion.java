package ar.com.unpaz.model;

public class Camion extends Vehiculo{

	public Camion(String patente, String marca, double combustible) {
		super(patente, marca, combustible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avanzar(int kilometros) {
		if(combustible > 0) {
			
			double combustibleNecesario = kilometros / 4;
			this.combustible = Math.max(0, this.combustible - combustibleNecesario);
		}else {
			System.out.println("No cuenta con combustible suficiente para avanzar.\n");
		}
	}

	@Override
	public String toString() {
		return "Camion: " + super.toString();
	}
}
