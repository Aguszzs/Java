package com.coderhouse;

import com.coderhouse.objeto.Perro;

public class Clase04 {

	public static void main(String[] args) throws Exception {
		
		
		// TODO Auto-generated method stub

		
		Perro perro1 = new Perro();
		/*
		perro1.nombre = "pepe";
		perro1.color = "negro";
		perro1.edad = 2;
		perro1.raza = "gordo";
		perro1.tamanio = "mediano";
		perro1.ladrar();
		perro1.caminar();
		*/
		/*perro1.setNombre("pepe");
		perro1.setColor("negro");
		perro1.setEdad(2);
		perro1.setRaza("gordo");
		perro1.setTamanio("mediano");
		
		perro1.ladrar();
		perro1.caminar();
		*/
		
		
		/*
		
		String[] nombres = new String[] {
				"jose",
				"pepe",
				"pablo",
				"cesar"
		};
		
		imprimirListaDeNombres(nombres);
		
		sumarNumeros(55, 34);
		*/
		try {
		perro1.setNombre("pepe");
		perro1.setColor("negro");
		perro1.setEdad(15);
		perro1.setRaza("gordo");
		perro1.setTamanio("mediano");
		
		System.out.println("perro " + perro1);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		perro1.ladrar();
		perro1.caminar();
		
		double radio = 5;
		System.out.println("area del ciculo " + radio + " es " + calcularAreaDeUnCirculo(radio));
		calcularAreaDeUnCirculo(5d);
		
	}
	/*private static void imprimirListaDeNombres(String[] nombres) {
		
		for (String nombre : nombres) {
			System.out.println("nombre " + nombre);
		}
	}
	
	private static void sumarNumeros (int numeroA, int numeroB) {
		System.out.println("La suma entre " + numeroA + " y " + numeroB + " es = " +(numeroA + numeroB));
	}*/
	
	static final double PI; 
	static final double PO; 

	static {PI = 3.145435363453; PO = 4.343;};
		
		
	private static double calcularAreaDeUnCirculo(double radio) {
		return PI * Math.pow(radio, 2);
	}
	

}
