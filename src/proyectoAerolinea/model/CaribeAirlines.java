package proyectoAerolinea.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class CaribeAirlines {

	private Set<Piloto> listaPilotos;
	private Set<CoPiloto> listaCoPilotos;
	private ArrayList<Auxiliar> listaAuxiliares;




	// Constructores

	public CaribeAirlines() {
		super();
		this.listaCoPilotos = new TreeSet<>();
		this.listaPilotos = new TreeSet<>();
		this.listaAuxiliares = new ArrayList<>();

	}
	// Get y Set


	public ArrayList<Auxiliar> getListaAuxiliares() {
		return listaAuxiliares;
	}

	public Set<Piloto> getListaPilotos() {
		return listaPilotos;
	}


	public void setListaPilotos(Set<Piloto> listaPilotos) {
		this.listaPilotos = listaPilotos;
	}





	public Set<CoPiloto> getListaCoPilotos() {
		return listaCoPilotos;
	}


	public void setListaCoPilotos(Set<CoPiloto> listaCoPilotos) {
		this.listaCoPilotos = listaCoPilotos;
	}


	public void setListaAuxiliares(ArrayList<Auxiliar> listaAuxiliares) {
		this.listaAuxiliares = listaAuxiliares;
	}

}
