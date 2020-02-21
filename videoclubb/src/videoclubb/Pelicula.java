package videoclubb;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {
	
	private int ID;
	private String Titulo;
	private String Director;
	private int Duracion;
	private String Genero;
	private int Año;
	private boolean Disponibilidad;
	private int copiasTotal; //COPIAS TOTALES DEL TITULO QUE PODEMOS LLEGAR A TENER EN LA ESTANTERÍA
	private int copiasReservadas;// COPIAS RESERVADAS POR LOS CLIENTES
	private static final int COPIASMAX=3000;//MAXIMO DE COPIAS QUE CABEN EN LA ESTANTERÍA
	private static int copiasTotVideoClub; //COPIAS TOTALES QUE TENEMOS DE TODOS LOS TITULOS
	
	
	
	
	
//CONSTRUCTOR VACÍO
	public Pelicula() {
		
	}
//CONSTRUCTOR CON TODOS LOS PARÁMETROS
	public Pelicula(int ID,String Titulo,String Director, int Duracion, int Año,boolean Disponibilidad,int copiasTotal,int copiasReservadas) {
		this.Titulo = Titulo;
		this.Año = Año;
		this.Director = Director;
		this.Genero = Genero;
		this.Duracion = Duracion;
		this.Disponibilidad = Disponibilidad;
		this.copiasReservadas = copiasReservadas;
		this.copiasTotal = copiasTotal;
		this.ID = ID;
	}
	
	// GETTERS Y SETTERS
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public int getDuracion() {
		return Duracion;
	}

	public void setDuracion(int duracion) {
		Duracion = duracion;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public boolean isDisponibilidad() {
		return Disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		Disponibilidad = disponibilidad;
	}

	public int getCopiasTotal() {
		return copiasTotal;
	}

	public void setCopiasTotal(int copiasTotal) {
		this.copiasTotal = copiasTotal;
	}

	public int getCopiasReservadas() {
		return copiasReservadas;
	}

	public void setCopiasReservadas(int copiasReservadas) {
		this.copiasReservadas = copiasReservadas;
	}
	
//MÉTODO PARA AÑADIR UNA PELÍCULA A LA LISTA
	public static void añadirPelicula(ArrayList<Pelicula> lista){
		Pelicula p = new Pelicula();
		Scanner ct = new Scanner(System.in);
		System.out.println("Introduzca el número de copias que quiere introducir de la Película:");
		int masCopias = ct.nextInt();
		int contadorID;
		contadorID=0;
		if (masCopias+copiasTotVideoClub <COPIASMAX) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca el título de la Película:");
			p.setTitulo(sc.nextLine());
			System.out.println("Introduzca el año de estreno de la Película:");
			p.setAño(sc.nextInt());
			System.out.println("Introduzca el director de la Película:");
			p.setDirector(sc.nextLine());
			System.out.println("Introduzca la duración de la Película en minutos:");
			p.setDuracion(sc.nextInt());
			System.out.println("Introduzca el género de la Película:");
			p.setGenero(sc.nextLine());
			p.setCopiasTotal(ct.nextInt());
			p.setID(contadorID+1);
			lista.add(p);
		}
		else {
			System.out.println("El videoclub está lleno, no se pueden introducir más películas");
		}
	}



	
	
	
//MÉTODO PARA RESERVAR PELICULAS
	public void reservarPelicula(ArrayList<Pelicula> lista) {
		for (Pelicula p : lista) {
			System.out.println(ID+" "+Titulo+" del año "+Año+ " y el director es:"+Director);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el ID de la película que quiere reservar");
		int IDElegido = sc.nextInt();
		for (Pelicula p : lista) {
			int id = getID();
			if (id == IDElegido ) {
				if (Disponibilidad) {
					System.out.println("Hay copias disponibles de esta película. ¿Quiere reservarla?");
					Scanner escanerReserva = new Scanner(System.in);
					String opcion = escanerReserva.nextLine();
					opcion = opcion.toUpperCase().charAt(0) + opcion.substring(1, opcion.length()).toLowerCase();
					if (opcion == "Si") {
						System.out.println("La copia ha sido reservada.");
						copiasTotal = copiasTotal - 1;
						copiasReservadas = copiasReservadas + 1;
						if (copiasTotal == 0) {
							Disponibilidad = false;
						}
					}
				}
				else {
					System.out.println("No hay copias disponibles de esta película");
				}
				
				
			}
		}
			
		}
		
		
		
		
	
	public void buscarPelicula(ArrayList<Pelicula> lista) {
		Scanner bp = new Scanner(System.in);
		System.out.println("Que película quiere buscar");
		String peli;
		peli = bp.nextLine();
		int i = 0;
		for ( Pelicula p :lista) {
			if (p.getTitulo().contains(peli)) {
				
				System.out.println(Titulo);
			}
			else {
				System.out.println("No se ha encontrado ninguna película con esos datos.");
			}
		}
				
	}
		
	}
	
	
	
	
	
	
	

