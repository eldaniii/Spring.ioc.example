package com.app.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {
	public static void main(String[] args) {
		
		/*
		JefeEmpleado Empleado1=new JefeEmpleado();
		
		System.out.println(Empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		Empleados Maria=contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		contexto.close();
		
	}
}
