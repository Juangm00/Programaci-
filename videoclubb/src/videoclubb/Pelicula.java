package videoclubb;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {
	
	private int ID;
	private String Titulo;
	private String Director;
	private int Duracion;
	private String Genero;
	private int A�o;
	private boolean Disponibilidad;
	private int copiasTotal; //COPIAS TOTALES DEL TITULO QUE PODEMOS LLEGAR A TENER EN LA ESTANTER�A
	private int copiasReservadas;// COPIAS RESERVADAS POR LOS CLIENTES
	private static final int COPIASMAX=3000;//MAXIMO DE COPIAS QUE CABEN EN LA ESTANTER�A
	private static int copiasTotVideoClub; //COPIAS TOTALES QUE TENEMOS DE TODOS LOS TITULOS
	
	
	
	
	
//CONSTRUCTOR VAC�O
	public Pelicula() {
		
	}
//CONSTRUCTOR CON TODOS LOS PAR�METROS
	public Pelicula(int ID,String Titulo,String Director, int Duracion, int A�o,boolean Disponibilidad,int copiasTotal,int copiasReservadas) {
		this.Titulo = Titulo;
		this.A�o = A�o;
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

	public int getA�o() {
		return A�o;
	}

	public void setA�o(int a�o) {
		A�o = a�o;
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
	
//M�TODO PARA A�ADIR UNA PEL�CULA A LA LISTA
	public static void a�adirPelicula(ArrayList<Pelicula> lista){
		Pelicula p = new Pelicula();
		Scanner ct = new Scanner(System.in);
		System.out.println("Introduzca el n�mero de copias que quiere introducir de la Pel�cula:");
		int masCopias = ct.nextInt();
		int contadorID;
		contadorID=0;
		if (masCopias+copiasTotVideoClub <COPIASMAX) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca el t�tulo de la Pel�cula:");
			p.setTitulo(sc.nextLine());
			System.out.println("Introduzca el a�o de estreno de la Pel�cula:");
			p.setA�o(sc.nextInt());
			System.out.println("Introduzca el director de la Pel�cula:");
			p.setDirector(sc.nextLine());
			System.out.println("Introduzca la duraci�n de la Pel�cula en minutos:");
			p.setDuracion(sc.nextInt());
			System.out.println("Introduzca el g�nero de la Pel�cula:");
			p.setGenero(sc.nextLine());
			p.setCopiasTotal(ct.nextInt());
			p.setID(contadorID+1);
			lista.add(p);
		}
		else {
			System.out.println("El videoclub est� lleno, no se pueden introducir m�s pel�culas");
		}
	}



	
	
	
//M�TODO PARA RESERVAR PELICULAS
	public void reservarPelicula(ArrayList<Pelicula> lista) {
		for (Pelicula p : lista) {
			System.out.println(ID+" "+Titulo+" del a�o "+A�o+ " y el director es:"+Director);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el ID de la pel�cula que quiere reservar");
		int IDElegido = sc.nextInt();
		for (Pelicula p : lista) {
			int id = getID();
			if (id == IDElegido ) {
				if (Disponibilidad) {
					System.out.println("Hay copias disponibles de esta pel�cula. �Quiere reservarla?");
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
					System.out.println("No hay copias disponibles de esta pel�cula");
				}
				
				
			}
		}
			
		}
		
		
		
		
	
	public void buscarPelicula(ArrayList<Pelicula> lista) {
		Scanner bp = new Scanner(System.in);
		System.out.println("Que pel�cula quiere buscar");
		String peli;
		peli = bp.nextLine();
		int i = 0;
		for ( Pelicula p :lista) {
			if (p.getTitulo().contains(peli)) {
				
				System.out.println(Titulo);
			}
			else {
				System.out.println("No se ha encontrado ninguna pel�cula con esos datos.");
			}
		}
				
	}
		
	}
	
	
	
	
	
	
	

