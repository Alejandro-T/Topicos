package repaso;

import java.util.Scanner;

public class MainAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARACION DE VAIABLES...
		Alumno grupo2[] = new Alumno[4];
		Scanner leer = new Scanner(System.in);
		String nombre="";
		int dia=0,mes=0,anio=0;
		int grupo=0;
		float calif [] = new float [4];
		for(int i=1; i<grupo2.length; i+=2)
		{
			System.out.print((i)+". Ingresa el nombre del alumno: ");
			nombre = leer.next();
			System.out.print((i)+". Ingresa dia de inscripción: ");
			dia = leer.nextInt();
			System.out.print((i)+". Ingresa mes de inscripción: ");
			mes = leer.nextInt();
			System.out.print((i)+". Ingresa año de inscripción: ");
			anio = leer.nextInt();
			System.out.print((i)+". Ingresa el grupo del alumno: ");
			grupo = leer.nextInt();
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
			grupo2[i] = new Alumno(nombre, grupo,new Fecha(dia,mes,anio),calif);
			//grupo2[i].setNombre(leer.next());
		}
		for(int i = 1; i<grupo2.length; i+=2)
		{
			System.out.print(grupo2[i]);
		}
		//nombre y promedio de los alumnos que nacieron en 1997
		for(int i=0; i<grupo2.length; i+=2)
		{
			if(grupo2[i].getFechaNacimiento().getAño()==1997)
			{
				System.out.print("Nombre del alumno: "+grupo2[i].getNombre()
						+"\nPromedio del alumno: "+grupo2[i].obtenerPromedio());
			}
		}
		//e)Aumentar 10 puntos a todos los alumnos que nacieron en el mes de marzo...
		for(int i=1; i<grupo2.length; i+=2)
		{
			if(grupo2[i].getFechaNacimiento().getMes()==3)
			{
				float calif2[] = grupo2[i].getCalif();
				for(int k = 0; k<calif.length; k++)
				{
					calif2[k]+=10;
					if(calif2[k]>100)
					{
						calif2[k] = 100;
					}
				}
				grupo2[i].setCalif(calif2);
			}
		}
	}
}