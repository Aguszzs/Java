package com.coderhouse.objeto;

public class Perro {
	
	private static final int EDAD_MAXIMA = 15; //constante

	//atributos o variables de clase
	private String nombre;
	private String raza;
	private String color;
	private int edad;
	private String tamanio;
	
	//metodos
	public void ladrar() {
		System.out.println(getNombre() + " esta ladrando");
	}
	public void caminar() {
		System.out.println(getNombre() + " esta caminando");
	}
	
	// Getters and Setters
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return this.raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) throws Exception{
		String mensajeDeError = "El Perro no vive mas de " + EDAD_MAXIMA + " años de edad";
		if(edad > EDAD_MAXIMA) {
			throw new Exception(mensajeDeError);
		} else {
			this.edad = edad;
		}
	}
	public String getTamanio() {
		return this.tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", tamanio="
				+ tamanio + "]";
	}
	
	
	
	
}
