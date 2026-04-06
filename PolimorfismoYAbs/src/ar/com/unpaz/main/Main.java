package ar.com.unpaz.main;

import java.util.ArrayList;

import ar.com.unpaz.model.Auto;
import ar.com.unpaz.model.Camion;
import ar.com.unpaz.model.Moto;
import ar.com.unpaz.model.Vehiculo;

public class Main {
	public static void main(String[] args) {
		Vehiculo moto = new Moto("ABC123","YAMAHA",15);
		Vehiculo camion = new Camion("CBA-YZ 457","SCANIA",1500);
		Vehiculo auto = new Auto("DHC","RENAULT",50);
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		
		vehiculos.add(moto);
		vehiculos.add(auto);
		vehiculos.add(camion);
		
		for(Vehiculo v : vehiculos) {
			System.out.printf("Combustible antes de avanzar: %.2f \n", v.getCombustible());
			v.avanzar(300);
			System.out.println(v);
			
			System.out.printf("Combustible antes de avanzar: %.2f \n", v.getCombustible());
			v.avanzar(1000);
			System.out.println(v);
		}
	}
}
