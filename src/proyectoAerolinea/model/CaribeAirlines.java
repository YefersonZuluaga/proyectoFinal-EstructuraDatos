package proyectoAerolinea.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CaribeAirlines {

	private ArrayList<Piloto> listaPilotos;
	private ArrayList<CoPiloto> listaCoPilotos;
	private ArrayList<Auxiliar> listaAuxiliares;




	// Constructores

	public CaribeAirlines() {
		super();
	}
	// Get y Set

	public ArrayList<Piloto> getListaPilotos() {
		return listaPilotos;
	}

	public void setListaPilotos(ArrayList<Piloto> listaPilotos) {
		this.listaPilotos = listaPilotos;
	}

	public ArrayList<CoPiloto> getListaCoPilotos() {
		return listaCoPilotos;
	}

	public void setListaCoPilotos(ArrayList<CoPiloto> listaCopilotos) {
		this.listaCoPilotos = listaCopilotos;
	}

	public ArrayList<Auxiliar> getListaAuxiliares() {
		return listaAuxiliares;
	}

	public void setListaAuxiliares(ArrayList<Auxiliar> listaAuxiliares) {
		this.listaAuxiliares = listaAuxiliares;
	}

}
