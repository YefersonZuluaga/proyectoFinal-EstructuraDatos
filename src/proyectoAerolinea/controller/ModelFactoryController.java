package proyectoAerolinea.controller;

import proyectoAerolinea.model.CaribeAirlines;

public class ModelFactoryController {

	CaribeAirlines caribeAirlines;

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
		inicializarDatos();
	}

	private void inicializarDatos() {
		System.out.println("hola");
	}

	public CaribeAirlines getCaribeAirlines() {
		return caribeAirlines;
	}

	public void setCaribeAirlines(CaribeAirlines caribeAirlines) {
		this.caribeAirlines = caribeAirlines;
	}

}