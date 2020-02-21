package videoclubb;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Pelicula p1 = new Pelicula();
		ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
		boolean Salir = false;
		
		
		
		
		
		if (Salir = false) {
			System.out.println("=============================");
			System.out.println("|			MENÚ			|");
			System.out.println("=============================");
			System.out.println("| 1. Añadir Película        |");
			System.out.println("| 2. Reservar Película      |");
			System.out.println("| 3. Buscar Película        |");
			System.out.println("| 4. Salir                  |");
			System.out.println("=============================");
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				p1.añadirPelicula(lista);
				break;
				
			case 2:
				p1.reservarPelicula(lista);
				System.out.println("=====================================");
				System.out.println("Estas son las películas disponibles:");
				System.out.println("=====================================");
				
				break;
				
			case 3:
				p1.buscarPelicula(lista);
				break;
			case 4:
				Salir = true;
			
			}
		}
		
	}


}