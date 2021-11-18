package proyectoAerolinea.model;

import java.util.ArrayList;

public class Aeronave {

	private Tripulantes tripulantes;
	private int numeroPasajeros;
	private double capacidadKg;
	private int numEjecutivos;
	private int numEconnomicos;
	private Silla[][] puestosEjecutivos;
	private Silla[][] puestosEconomicos;
	private ArrayList<Equipaje> listaEquipajes;



	public Aeronave(int numeroPasajeros, double capacidadKg, int numEjecutivos, int numEconnomicos) {
		super();
		this.numeroPasajeros = numeroPasajeros;
		this.capacidadKg = capacidadKg;
		this.numEjecutivos = numEjecutivos;
		this.numEconnomicos = numEconnomicos;
	}
	public Aeronave(Tripulantes tripulantes, int numeroPasajeros, double capacidadKg, int numEjecutivos,
			int numEconnomicos, Silla[][] puestosEjecutivos, Silla[][] puestosEconomicos,
			ArrayList<Equipaje> listaEquipajes) {
		super();
		this.tripulantes = tripulantes;
		this.numeroPasajeros = numeroPasajeros;
		this.capacidadKg = capacidadKg;
		this.numEjecutivos = numEjecutivos;
		this.numEconnomicos = numEconnomicos;
		this.puestosEjecutivos = puestosEjecutivos;
		this.puestosEconomicos = puestosEconomicos;
		this.listaEquipajes = listaEquipajes;
	}
	//gets y sets
	public Tripulantes getTripulantes() {
		return tripulantes;
	}
	public void setTripulantes(Tripulantes tripulantes) {
		this.tripulantes = tripulantes;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public double getCapacidadKg() {
		return capacidadKg;
	}
	public void setCapacidadKg(double capacidadKg) {
		this.capacidadKg = capacidadKg;
	}
	public int getNumEjecutivos() {
		return numEjecutivos;
	}
	public void setNumEjecutivos(int numEjecutivos) {
		this.numEjecutivos = numEjecutivos;
	}
	public int getNumEconnomicos() {
		return numEconnomicos;
	}
	public void setNumEconnomicos(int numEconnomicos) {
		this.numEconnomicos = numEconnomicos;
	}
	public Silla[][] getPuestosEjecutivos() {
		return puestosEjecutivos;
	}
	public void setPuestosEjecutivos(Silla[][] puestosEjecutivos) {
		this.puestosEjecutivos = puestosEjecutivos;
	}
	public Silla[][] getPuestosEconomicos() {
		return puestosEconomicos;
	}
	public void setPuestosEconomicos(Silla[][] puestosEconomicos) {
		this.puestosEconomicos = puestosEconomicos;
	}
	public ArrayList<Equipaje> getListaEquipajes() {
		return listaEquipajes;
	}
	public void setListaEquipajes(ArrayList<Equipaje> listaEquipajes) {
		this.listaEquipajes = listaEquipajes;
	}



}
