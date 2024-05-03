package com.app.ioc;

public class DirectorEmpleado implements Empleados {

	private CreacionInforme informeNuevo;
	
	public DirectorEmpleado(CreacionInforme informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {
		return "Gestiono la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+informeNuevo.getInforme();
	}
}
