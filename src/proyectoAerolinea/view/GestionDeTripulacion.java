package proyectoAerolinea.view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;

import proyectoAerolinea.controller.GestionDeTripulacionController;
import proyectoAerolinea.model.CaribeAirlines;

import org.eclipse.jface.viewers.TableViewer;

public class GestionDeTripulacion extends Composite {
	
	GestionDeTripulacionController gestionDeTripulacioncontroller = new GestionDeTripulacionController();
	CaribeAirlines cariberAirlines = gestionDeTripulacioncontroller.getCaribeAirlines();
	private Table table;
	private Table table_1;
	private Table table_2;
	private Table table_3;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GestionDeTripulacion(Composite parent, int style) {
		super(parent, style);

		Group grpPilotos = new Group(this, SWT.NONE);
		grpPilotos.setText("Pilotos");
		grpPilotos.setBounds(30, 10, 189, 160);

		TableViewer tableViewer = new TableViewer(grpPilotos, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(10, 20, 169, 130);

		Group grpCopilotos = new Group(this, SWT.NONE);
		grpCopilotos.setText("CoPilotos");
		grpCopilotos.setBounds(245, 10, 189, 160);

		TableViewer tableViewer_1 = new TableViewer(grpCopilotos, SWT.BORDER | SWT.FULL_SELECTION);
		table_1 = tableViewer_1.getTable();
		table_1.setLinesVisible(true);
		table_1.setHeaderVisible(true);
		table_1.setBounds(10, 22, 169, 128);

		Group grpAuxiliares = new Group(this, SWT.NONE);
		grpAuxiliares.setText("Auxiliares");
		grpAuxiliares.setBounds(459, 10, 189, 160);

		TableViewer tableViewer_2 = new TableViewer(grpAuxiliares, SWT.BORDER | SWT.FULL_SELECTION);
		table_2 = tableViewer_2.getTable();
		table_2.setLinesVisible(true);
		table_2.setHeaderVisible(true);
		table_2.setBounds(10, 24, 169, 126);

		Button btnAgregarPiloto = new Button(this, SWT.NONE);
		btnAgregarPiloto.setBounds(77, 176, 97, 25);
		btnAgregarPiloto.setText("Agregar Piloto");

		Button btnAgregarCopiloto = new Button(this, SWT.NONE);
		btnAgregarCopiloto.setBounds(284, 176, 111, 25);
		btnAgregarCopiloto.setText("Agregar CoPiloto");

		Button btnAgregarAuxiliar = new Button(this, SWT.NONE);
		btnAgregarAuxiliar.setBounds(504, 176, 111, 25);
		btnAgregarAuxiliar.setText("Agregar Auxiliar");

		Group grpTripulacion = new Group(this, SWT.NONE);
		grpTripulacion.setText("Tripulacion");
		grpTripulacion.setBounds(30, 218, 628, 150);

		TableViewer tableViewer_3 = new TableViewer(grpTripulacion, SWT.BORDER | SWT.FULL_SELECTION);
		table_3 = tableViewer_3.getTable();
		table_3.setLinesVisible(true);
		table_3.setHeaderVisible(true);
		table_3.setBounds(10, 22, 496, 118);

		Button btnEliminarTripulante = new Button(grpTripulacion, SWT.NONE);
		btnEliminarTripulante.setBounds(512, 65, 110, 25);
		btnEliminarTripulante.setText("Eliminar Tripulante");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
