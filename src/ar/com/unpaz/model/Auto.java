package ar.com.unpaz.model;

public class Auto extends Vehiculo{

	public Auto(String patente, String marca, double combustible) {
		super(patente, marca, combustible);
		
	}

	@Override
	public void avanzar(int kilometros) {
		if(this.combustible > 0) {		
			double combustibleNecesario = kilometros / 10;
			this.combustible = Math.max(0, this.combustible - combustibleNecesario);
			
		}else {
			System.out.println("No cuenta con combustible suficiente para avanzar.\n");
		}
		
	}

	@Override
	public String toString() {
		return "Auto: " + super.toString();
	}

}
