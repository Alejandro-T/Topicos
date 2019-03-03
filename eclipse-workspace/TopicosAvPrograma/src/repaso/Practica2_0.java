package repaso;

import javax.swing.JOptionPane;

public class Practica2_0 {

	public static void main(String[] args) {
		int opc;
		Alumno escuelita[] = new Alumno[7];
		String nombre="";
		int dia=0,mes=0,anio=0;
		int grupo=0;
		float calif [] = null;
		//Punto 3
		float calif2 [] = {100,75,10,45,77};
		escuelita[1] = new Alumno("MariaFernanda",1,new Fecha(10,1,1999),calif2);
		// TODO Auto-generated method stub
		do {
			opc = menu();
			
			switch(opc) {
			case 1:
				//Punto 2...
				for(int i=0; i<escuelita.length; i+=2)
				{
					nombre = JOptionPane.showInputDialog
							("Enter the name of the student");
					try
					{
						dia = Integer.parseInt(JOptionPane.showInputDialog
								("Enter day of birth"));
						
					}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null,"Enter a valid character");
						do {
							dia = Integer.parseInt(JOptionPane.showInputDialog
									("Enter day of birth"));
						}while(dia<Integer.MAX_VALUE && dia>Integer.MIN_VALUE);
					}
					try {
						mes = Integer.parseInt(JOptionPane.showInputDialog
								("Enter month of birth"));
					}catch(NumberFormatException a) {
						JOptionPane.showMessageDialog(null,"Enter a valid character");
					}
					try {
						anio = Integer.parseInt(JOptionPane.showInputDialog
								("Enter day of birth"));
					}catch(NumberFormatException r) {
						JOptionPane.showMessageDialog(null,"Enter a valid character");
					}
					try {
						grupo = Integer.parseInt(JOptionPane.showInputDialog
								("Enter group"));
					}catch(NumberFormatException g) {
						JOptionPane.showMessageDialog(null,"Enter a valid character");
					}			
					if(grupo==4)
					{
						calif = new float[4];
						for(int j=0; j<calif.length; j++)
						{
							do {
								calif[j] = Float.parseFloat(JOptionPane.showInputDialog
										((j+1)+". Ingresa calificación del alumno: "+nombre));
								if(calif[j]>-1 && calif[j]<101)
									break;
								else
								{
									JOptionPane.showMessageDialog(null,(j+1)+
											". Calificación fuera de rango","Aviso",JOptionPane.OK_OPTION);
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
								calif[j] = Float.parseFloat(JOptionPane.showInputDialog
										((j+1)+". Ingresa calificación del alumno: "+nombre));
								if(calif[j]>-1 && calif[j]<101)
									break;
								else
								{
									JOptionPane.showMessageDialog(null,(j+1)+
											". Calificación fuera de rango","Aviso",JOptionPane.OK_OPTION);
								}
							}while(calif[j]<0 || calif[j]>100);
						}
					}
					escuelita[i] = new Alumno(nombre, grupo,new Fecha(dia,mes,anio),calif);
				}
				break;
			case 2:
				//Punto 4
				for(int i = 0; i<escuelita.length; i++)
				{
					if(escuelita[i]!=null)
					{
						JOptionPane.showMessageDialog
						(null,"Alumnos actuales en el vector:\n"+escuelita[i]);
					}
					
				}
				break;
			case 3:
				//Punto 5 nombre y promedio de los alumnos que nacieron en 1997
				for(int i=0; i<escuelita.length; i++)
				{
					if(escuelita[i]!=null)
					{
						if(escuelita[i].getFechaNacimiento().getAño()==1999 
								&& escuelita[i].getFechaNacimiento().getMes()==1)
						{
							JOptionPane.showMessageDialog
							(null,"Alumnos que nacieron en enero de 1999:\n"+escuelita[i].getNombre());
						}
					}
				}
				break;
			case 4:
				
				break;
				default: break;
			}	
		}while(opc!=5);
	}
	public static byte menu()
	{
		byte opc = Byte.parseByte(JOptionPane.showInputDialog("1)Ingreso de datos"
				+ "\n2b)Alumnos Actuales en el vector"
				+ "\n3c)Alumnos que nacieron en enero de 1999"
				+ "\n4d)Aumentar 10 puntos a los alumnos nacidos en marzo"
				+ "\n5e)Salir..."));
		return opc;
	}
}