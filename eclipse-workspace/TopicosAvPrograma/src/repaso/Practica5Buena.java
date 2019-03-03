package repaso;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Practica5Buena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		Alumno [][] disney = {{new Alumno("Hugo"),new Alumno("Pago"), new Alumno("Luis")},
				{new Alumno("Disney"),new Alumno("Donald")},
				{new Alumno("Lucas"),new Alumno("Mickey"),new Alumno("Mimi"),new Alumno("Porky")}};
		do
		{
			opc = menu();
			switch(opc)
			{
			case 1:
				int fil = Integer.parseInt(JOptionPane.showInputDialog("Ingresa fila"));
				if(fil<disney.length)
				{
					int grupo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa grupo"));
					for(int j=0; j<disney[fil].length; j++)
					{
						disney[fil][j].setGrupo(grupo);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No exiiste la fila");
				}
				break;
			case 2:
				fil = Integer.parseInt(JOptionPane.showInputDialog("Ingresa fila"));
				if(fil<disney.length)
				{
					int col = Integer.parseInt(JOptionPane.showInputDialog("Ingresa columna"));
					if(col<disney[fil].length)
					{
						int tamCalif = Integer.parseInt(JOptionPane.showInputDialog
								("Ingresa calificacaiones a capturar"));
						float calif[] = new float [tamCalif];
						for(int i = 0; i<calif.length; i++)
						{
							calif[i] = Float.parseFloat(JOptionPane.showInputDialog
									("Ingresa calificaion"));
						}
						disney[fil][col].setCalif(calif);						
					}
				}
				break;
			case 3:
				for(int i = 0; i<disney.length; i++)
				{
					for(int j=0; j<disney[i].length; j++)
					{
						if(disney[i][j]!= null)
						{
							System.out.println((i)+""+(j)+""+disney[i][j]);
						}
						else
						{
							System.out.println("No ha sido creado"
									+ "");
						}
						
					}
				}
				break;
			case 4:
				//Se captura la fila y se despligan el promedio de todos loa alumnos
				fil = Integer.parseInt(JOptionPane.showInputDialog("Ingresa fila"));
				if(fil<disney.length)
				{
					for(int j=0; j<disney[fil].length; j++)
					{
						if(disney[fil][j].getCalif()!=null)
						{
							JOptionPane.showMessageDialog(null,(fil)+""+(j)
									+" El alumno "+disney[fil][j].getNombre()
									+"\n tiene un promedio de "+disney[fil][j].obtenerPromedio());
						}
					}
				}
				else
					JOptionPane.showMessageDialog(null,"No existe");
				break;
			case 5: 
				fil = Integer.parseInt(JOptionPane.showInputDialog("Ingresa fila"));
				if(fil<disney.length)
				{
					int col = Integer.parseInt(JOptionPane.showInputDialog("Ingresa columna"));
					if(col<disney[fil].length)
					{
						int dia = Integer.parseInt(JOptionPane.showInputDialog
								("Ingresa dia"));
						int mes = Integer.parseInt(JOptionPane.showInputDialog
								("Ingresa mes"));
						int anio = Integer.parseInt(JOptionPane.showInputDialog
								("Ingresa año"));
						disney[fil][col].setFechaNacimiento(new Fecha(dia,mes,anio));
					}
					else
						JOptionPane.showMessageDialog(null,"No existe");
				}
				else
					JOptionPane.showMessageDialog(null,"No existe");
				break;
			case 6:
				//Desplegar nomres y fecha de naciemnto de alumnos que nacieron en 1999.
				for(int i=0; i<disney.length;i++)
				{
					for(int j=0; j<disney[i].length; j++)
					{
						if(disney[i][j].getFechaNacimiento()!=null)
						{
							if(disney[i][j].getFechaNacimiento().getAño()==1999)
							{
								JOptionPane.showMessageDialog
								(null,(i)+"."+(j)+" El alumno "+disney[i][j].getNombre()
										+"\nNacio en "+disney[i][j].getFechaNacimiento());
							}
						}
					}
				}
				break;
			}
		}while(opc!=7);
	}
	public static int menu()
	{
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Asignar grupo"
				+ "\n2.Captura de calificaciones"
				+ "\n3.Desplegar datos de alumnos"
				+ "\n4.Promedio de alumnos de fila"
				+ "\n5.Captura de fecha de nacimiento"
				+ "\n6.Alumnos que nacieron en 1999"
				+ "\n7.Salir"));
		return opcion;
	}

}