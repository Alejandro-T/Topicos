package repaso;

import javax.swing.JOptionPane;

public class Practica5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno [][] disney = {{new Alumno("Hugo"),new Alumno("Pago"), new Alumno("Luis")},
				{new Alumno("Disney"),new Alumno("Donald")},
				{new Alumno("Lucas"),new Alumno("Mickey"),new Alumno("Mimi"),new Alumno("Porky")}};
		int opcion=0;
		do
		{
			opcion = menu();
			switch(opcion)
			{
			case 1:
				int fila=0;
				int grupo=0;
				fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa columna"));
				if(fila<disney.length)
				{
					grupo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa grupo"));
					for(int h=0; h<disney[fila].length; h++)
					{
						disney[fila][h].setGrupo(grupo);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No exixste");
				}
				break;
			case 2:
				fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa FILA"));
				int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingresa columna"));
				if(fila<disney.length)
				{
					if(columna<disney[fila].length)
					{
						int cant = Integer.parseInt
								(JOptionPane.showInputDialog("Ingresa calificaiones"));
						float [] array = new float[cant];
						for(float elemento : array)
						{
							elemento = Float.parseFloat(JOptionPane.showInputDialog("calif"));
						}
						
					}
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No exixste");
				}
				break;
			}
		}while(opcion !=7);
	}
	
	public static int menu()
	{
		int opc = Integer.parseInt(JOptionPane.showInputDialog
				("1.Asignar grupo"
						+ "\n2.Captura de calificaciones"
						+ "\n3.Desplegar datos de alumnos"
						+ "\n4.Promedio de alumnos de una fila"
						+ "\n5.Captura de fecha de nacimiento"
						+ "\n6.Alumnos que nacieron en 1999"
						+ "\n7.Salir"));
		return opc;
	}

}
