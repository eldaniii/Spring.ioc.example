package com.app.ioc;

public class JefeEmpleado implements Empleados {

	private CreacionInforme informeNuevo;
	
	public JefeEmpleado(CreacionInforme informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe con arreglos: "+informeNuevo.getInforme();
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono las cuestiones relativas a mis compañeros de sección";
	}
}
