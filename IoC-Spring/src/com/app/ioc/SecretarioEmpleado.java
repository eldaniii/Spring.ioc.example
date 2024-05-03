package com.app.ioc;

public class SecretarioEmpleado implements Empleados {

	private CreacionInforme informeNuevo;
	
	public SecretarioEmpleado(CreacionInforme informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {
		return "Gestionar las tareas de los Jefes";
	}

	public void setInformeNuevo(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el Secretario: "+informeNuevo.getInforme();
	}
}
