package repaso;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//DECLARCION DE OBJETOS...
		Scanner leer  = new Scanner(System.in);
		EquipoSoccer []ligaMx = new EquipoSoccer[2];
		//DECLARACIÓN DE VARIABLES...
		String nombre="";
		String []nombreJugadores;
		int puntos=0;
		int cantidadJugadores=0;
		//LECTURA DE DATOS...
		for(int i=0; i<ligaMx.length; i++)
		{
			System.out.println("Nombre del equipo: ");
			nombre = leer.next();
			System.out.println("Puntos del equipo: ");
			puntos = leer.nextInt();
			System.out.println("Cantidad de jugadores: ");
			cantidadJugadores = leer.nextInt();
			nombreJugadores = new String[cantidadJugadores];
			for(int j=0; j<cantidadJugadores; j++)
			{
				System.out.println((j+1)+". Nombre el jugador: ");
				nombreJugadores[j] = leer.next();
			}
			ligaMx[i] = new EquipoSoccer(nombre,puntos,nombreJugadores);
		}
		int suma = 0;
		for(int i =0; i<ligaMx.length; i++)
		{
			suma+= ligaMx[i].getPuntos();
		}
		//IMPRESIÓN DE DATOS...
		for(int i = 0; i<ligaMx.length; i++)
		{
			if(ligaMx[i].getPuntos()>7)
			{
				System.out.println(ligaMx[i].getNombre());
			}
		}
		System.out.println("Suma total de los equipos: "+suma);
		
		//CERRADO DE FLUJOS...
		leer.close();
	}
}