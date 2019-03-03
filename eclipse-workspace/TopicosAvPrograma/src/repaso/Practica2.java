package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARACION DE VAIABLES...
		//Punto 1...
		Alumno escuelita[] = new Alumno[7];
		
		Scanner leer = new Scanner(System.in);
		String nombre="";
		int dia=0,mes=0,anio=0;
		int grupo=0;
		float calif [] = null;
		//Punto 2...
		for(int i=0; i<escuelita.length; i+=2)
		{
			System.out.print((i)+". Ingresa el nombre del alumno: ");
			nombre = leer.next();
			System.out.print((i)+". Ingresa dia de nacimiento: ");
			dia = leer.nextInt();
			System.out.print((i)+". Ingresa mes de nacimiento: ");
			mes = leer.nextInt();
			System.out.print((i)+". Ingresa año de nacimiento: ");
			anio = leer.nextInt();
			System.out.print((i)+". Ingresa el grupo del alumno: ");
			grupo = leer.nextInt();
			if(grupo==4)
			{
				calif = new float[4];
				for(int j=0; j<calif.length; j++)
				{
					do {
						System.out.printf((j+1)+".Ingresa calificación del alumno(%s) ",nombre);
						calif[j] = leer.nextFloat();
						if(calif[j]>-1 && calif[j]<101)
							break;
						else
						{
							System.out.println((j+1)+". Calificacion fuera de rango");
						}
					}while(calif[j]<0 || calif[j]>100);
				}
			}
			else
			{
				calif = new float[3];
				for(int j=0; j<calif.length; j++)
				{
					do {
						System.out.printf((j+1)+".Ingresa calificación del alumno(%s) ",nombre);
						calif[j] = leer.nextFloat();
						if(calif[j]>-1 && calif[j]<101)
							break;
						else
						{
							System.out.println((j+1)+". Calificacion fuera de rango");
						}
					}while(calif[j]<0 || calif[j]>100);
				}
			}
			escuelita[i] = new Alumno(nombre, grupo,new Fecha(dia,mes,anio),calif);
		}
		//Punto 3
		float calif2 [] = {100,75,10,45,77};
		/*Manera dos de declarar un arreglo
		 * calif2 = new float[5];
		 * calif2[0] = 100;
		 * calif2[1] = 30;
		 * calif2[2] = 49;
		 * calif2[n] = .....;
		 */
		escuelita[1] = new Alumno("MariaFernanda",1,new Fecha(10,3,1999),calif2);
		
		//Punto 4
		for(int i = 0; i<escuelita.length; i++)
		{
			if(escuelita[i]!=null)
			{
				System.out.print("Alumnos actuales en el vector:\n"+escuelita[i]);
			}
			
		}
		//Punto 5 nombre y promedio de los alumnos que nacieron en 1997
		for(int i=0; i<escuelita.length; i++)
		{
			if(escuelita[i]!=null)
			{
				if(escuelita[i].getFechaNacimiento().getAño()==1999 
						&& escuelita[i].getFechaNacimiento().getMes()==1)
				{
					System.out.println("Nombres de alumnos nacidos en enero:");
					System.out.print("Nombre del alumno: "+escuelita[i].getNombre());
							
				}
			}
		}
		//e)Aumentar 10 puntos a todos los alumnos que nacieron en el mes de marzo...
		for(int i=0; i<escuelita.length; i++)
		{
			if(escuelita[i]!=null)
			{
				if(escuelita[i].getFechaNacimiento().getMes()==3)
				{
					calif2 = escuelita[i].getCalif();
					for(int k = 0; k<calif2.length; k++)
					{
						calif2[k]+=10;
						if(calif2[k]>100)
						{
							calif2[k] = 100;
						} 
					}
					escuelita[i].setCalif(calif2);
					System.out.println("Calificaciones aumentadas a: "
					+escuelita[i].getNombre()+"Calificaiones actuales: "+Arrays.toString(calif2));
				}
			}
		}
		//CERRADO DE FLUJOS...
		leer.close();
	}
}