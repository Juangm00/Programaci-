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
			System.out.println("|			MEN�			|");
			System.out.println("=============================");
			System.out.println("| 1. A�adir Pel�cula        |");
			System.out.println("| 2. Reservar Pel�cula      |");
			System.out.println("| 3. Buscar Pel�cula        |");
			System.out.println("| 4. Salir                  |");
			System.out.println("=============================");
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				p1.a�adirPelicula(lista);
				break;
				
			case 2:
				p1.reservarPelicula(lista);
				System.out.println("=====================================");
				System.out.println("Estas son las pel�culas disponibles:");
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