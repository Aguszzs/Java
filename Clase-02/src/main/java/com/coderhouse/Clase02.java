package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numA = 1;
		int numB = 2;

		System.out.println(numA);
		System.out.println(numB);

		if (numA < numB) {

			System.out.println("B ES MAYOR");
		} else {

			System.out.println("A ES MAYOR");
		}

		float numC = 4.0f;
		float numD = 2.0f;
		float resultado = numC / numD;

		if (numD != 0) {
			System.out.println("res = " + resultado);

		} else {
			System.out.println("NO LOCO NO");

		}

		int IngreseNumero = 0;

		if (IngreseNumero > 0) {
			System.out.println("el numero ingresado es positivo");
		} else if (IngreseNumero < 0) {
			System.out.println("El numero ingresado es negativo");
		} else if (IngreseNumero == 0) {
			System.out.println("El numero ingresado es cero");
		} else {
			System.out.println("El dato ingresado no es un numero");
		}

		int numDia = 15;

		if (numDia == 1) {
			System.out.println("Lunes");
		} else if (numDia == 2) {
			System.out.println("Martes");
		} else if (numDia == 3) {
			System.out.println("Miercoles");
		} else if (numDia == 4) {
			System.out.println("Jueves");
		} else if (numDia == 5) {
			System.out.println("Viernes");
		} else if (numDia == 6) {
			System.out.println("Sabado");
		} else if (numDia == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("PONE UN DIA UQE EXISTA");
		}

		String nomDia;
		int numeroDia = 3;

		switch (numeroDia) {
		case 1:
			nomDia = "Lunes";
			break;
		case 2:
			nomDia = "Martes";
			break;
		case 3:
			nomDia = "Miercoles";
			break;
		case 4:
			nomDia = "Jueves";
			break;
		case 5:
			nomDia = "Viernes";
			break;
		case 6:
			nomDia = "Sabado";
			break;
		case 7:
			nomDia = "Domingo";
			break;
		default:
			nomDia = "Dia invalido";
			break;
		}
		System.out.println("El Dia " + numeroDia + " es " + nomDia);
		
		
		String dia = "Lunes";
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "martes":
			System.out.println("Hoy es " + dia);
			break;
		case "miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;
			default: System.out.println("escribi bien");
			break;
		}
		
		//operador ternario
		int numZ = 1;
		int numY= 2;
		
		boolean condicion = numZ < numY;
		boolean resultadaso = condicion ? true : false;
		System.out.println("la condicion es " + resultadaso);
		
		//otra forma mas resumida es
		
		String mensaje = (numZ < numY)? "mensaje true" : "mensaje false";
		System.out.println(mensaje);
		
		
		
		//numeros aleatorios
		
		/*double randon = 0.0d;
		
		randon = Math.random();
		
		System.out.println("num generado es " + randon); */
		
		int minimo = 1;
		int maximo = 100;
		
		int rango = maximo - minimo + 1;
		
		int randon = 0;
		
		randon = (int) (Math.random() * rango ) + minimo;
		System.out.println("Numero generado es " + randon);

	}

}
