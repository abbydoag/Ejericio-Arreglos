package gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * @author Abby Donis
 *
 */
public class EJemploGUI {

	public static void main(String[] args) {	
		
		Carro[] carritos = new Carro[10];
		carritos[0] = new Carro(1963, "VW Deluxe", "Volkswagen");
		carritos[1] = new Carro(1968, "Ford Mustang GT", "Ford");
		carritos[2] = new Carro(1966, "Chrysler Imperial Crown", "Chrysler");
		carritos[3] = new Carro(2010, "Toyota Corolla", "Toyota");
		carritos[4] = new Carro(2022, "Santa Fe", "Hyundai");
		carritos[5] = new Carro(1930, "Ford A", "Ford");
		carritos[6] = new Carro(1962, "Alfa Romeo Giulia", "Alfa Romeo");
		carritos[7] = new Carro(1990, "Toyota RAV4", "Toyota");
		carritos[8] = new Carro(1950, "Maserati A6", "Maserati");
		carritos[9] = new Carro(1957, "Packard Clipper", "Packard");
		carritos[10] = new Carro(1968, "Dodge Charger", "Chrysler");
		
		
		BubbleSort<Carro> carritosort = new BubbleSort<Carro>();
		System.out.println("|~/~CARROS EN DESORDEN~/~|");
		escribirArreglo(carritos);
		System.out.println("ORDENANDO.");
		System.out.println("ORDENANDO..");
		System.out.println("ORDENANDO...");
		Collections.sort(carritos, new ComparadorCarro <Carro>());
		System.out.println("|~/~CARROS EN ORDEN~/~|");
		escribirArreglo(carritos);

	}
	
	
	public static void escribirArreglo(Carro[] carritosorden) {
		for (int i = 0; i < carritosorden.length; i++) {
			System.out.println("|" + i + "| >>>  " + carritosorden[i].toString());
		}
	}
	
	public static void SArreglo(Integer[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("|" + i + "| >>>  " + arreglo[i]);
		}
	}
	

}
