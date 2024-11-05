package com.coderhouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Clase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayInt = new int[6];
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;
		arrayInt[3] = 4;
		arrayInt[4] = 5;
		arrayInt[5] = 6;

		System.out.println("el array tiene " + arrayInt.length + " elementos"); // elementos del array
		System.out.println("el elemento 0 del array es " + arrayInt[0]);

		System.out.println(Arrays.toString(arrayInt)); // Mostrar elementos del array en un string

		String[] palabras = { // forma de asignar cuantos elementos y su contenido
				"Hola", // mas para hacerlo a mano
				"Mundo", "Coder" };
		System.out.println("el array tiene " + palabras.length + " elementos");
		System.out.println(Arrays.toString(palabras));

		// lista

		List<String> ListaDeNombres = new ArrayList<>();

		ListaDeNombres.add("Agustin");
		ListaDeNombres.add("Hola");
		ListaDeNombres.add("Jose");

		System.out.println("antes" + ListaDeNombres);

		List<String> ListaDeNombres2 = new ArrayList<>();
		ListaDeNombres2.add("Agusasdasdastin");
		ListaDeNombres2.add("pepe");
		ListaDeNombres2.add("asdasda");

		System.out.println(ListaDeNombres2);
		List<String> ListaDeNombres3 = new ArrayList<>();
		ListaDeNombres.addAll(ListaDeNombres2);

		System.out.println("despues" + ListaDeNombres);

		System.out.println(ListaDeNombres.containsAll(ListaDeNombres2)); // pregunta si la lista 1 contiene los
																			// elementos de la lista 2

		for (String nombre : ListaDeNombres) {
			System.out.println("nombre: " + nombre);
		}

		if (ListaDeNombres3.isEmpty()) {
			System.out.println("Ta vacio el 3");
		}

		int indice = 2;
		ListaDeNombres2.set(indice, "alsasd");
		System.out.println(ListaDeNombres2);

		ListaDeNombres2.remove(indice);
		System.out.println(ListaDeNombres2);

		// ListaDeNombres2.removeAll(ListaDeNombres2);
		System.out.println(ListaDeNombres2);

		String fede = "pepe";
		System.out.println(ListaDeNombres2.indexOf(fede));

		System.out.println("tiene " + ListaDeNombres2.size() + " elementos");

		// ciclos

		Iterator<String> iterator = ListaDeNombres2.iterator();

		while (iterator.hasNext()) {
			String nombre = iterator.next();
			System.out.println("nombres " + nombre);
			//iterator.remove();
			
		}
		System.out.println(ListaDeNombres2.size());
		
		//ciclo por conteo
		for (String nombre : ListaDeNombres2) {
			System.out.println(nombre);
		}
		
		int contador = 0;
		while(contador < 5) {
			System.out.println(contador);
			contador++;
		}
		contador = 0;
		do {
			System.out.println(contador);
			contador++;
		} while (contador < 5);
		
	}

}
