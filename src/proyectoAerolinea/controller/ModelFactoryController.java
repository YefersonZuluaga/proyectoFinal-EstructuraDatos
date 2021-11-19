package proyectoAerolinea.controller;

import java.util.HashSet;
import java.util.Set;

import proyectoAerolinea.model.Auxiliar;
import proyectoAerolinea.model.CaribeAirlines;
import proyectoAerolinea.model.CoPiloto;
import proyectoAerolinea.model.Piloto;
import proyectoAerolinea.persistencia.Persistencia;

public class ModelFactoryController {

	CaribeAirlines caribeAirlines;
	Persistencia persistencia;

	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser
		// protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactoryController() {
		caribeAirlines = new CaribeAirlines();
		inicializarDatos();
	}

	private void inicializarDatos() {
		System.out.println("hola");

	/*	Set<Piloto> listaPilotos = new HashSet<Piloto>();
		Piloto piloto = new Piloto("10013698", "cristian", "osorio", "cris@gmail.com", "bachiller, aviacion en la universidad del quindio");
	//	caribeAirlines.getListaPilotos().add(piloto);
		Piloto piloto1 = new Piloto("11365897", "yeferson", "zuluaga", "zuluaga@gmail.com", "bachiller, aviacion , medico");
	//	caribeAirlines.getListaPilotos().add(piloto1);
		Piloto piloto2 = new Piloto("12447836", "juliana", "arias", "julianita@gmail.com", "bachiller, aviacion , ingeniera aeroespacial");
	//	caribeAirlines.getListaPilotos().add(piloto2);
		listaPilotos.add(piloto);
		listaPilotos.add(piloto1);
		listaPilotos.add(piloto2);
		caribeAirlines.setListaPilotos(listaPilotos);

		CoPiloto coPiloto = new CoPiloto("1687533", "juan uran", "armenia", "uran@gmail.com", "primaria");
		CoPiloto coPiloto2 = new CoPiloto("65789", "juan osorio", "armenia", "osorio@gmail.com", "primaria");
		CoPiloto coPiloto3 = new CoPiloto("987545", "santiago carmona", "armenia", "carmona@gmail.com", "primaria");
		caribeAirlines.getListaCoPilotos().add(coPiloto);
		caribeAirlines.getListaCoPilotos().add(coPiloto2);
		caribeAirlines.getListaCoPilotos().add(coPiloto3);

		Auxiliar auxiliar = new Auxiliar("456987", "sandra milena", "armenia", "milenita@gmail.com", "bachiller");
		Auxiliar auxiliar2 = new Auxiliar("9512357", "pedro acero", "armenia", "pedro@gmail.com", "bachiller");
		Auxiliar auxiliar3 = new Auxiliar("31210", "camilo torres", "armenia", "torres@gmail.com", "bachiller");
		caribeAirlines.getListaAuxiliares().add(auxiliar);
		caribeAirlines.getListaAuxiliares().add(auxiliar2);
		caribeAirlines.getListaAuxiliares().add(auxiliar3);
*/
		try {
		//	persistencia.guardarRecursoXMLRelojeria(caribeAirlines);
			caribeAirlines = persistencia.cargarRecursoXMLRelojeria();
			caribeAirlines.getListaPilotos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public CaribeAirlines getCaribeAirlines() {
		return caribeAirlines;
	}

	public void setCaribeAirlines(CaribeAirlines caribeAirlines) {
		this.caribeAirlines = caribeAirlines;
	}

}