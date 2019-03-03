package examen1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alejandro Torres ramirez. Topcios
		int opcion = 0;
		Disco disco1[] = new Disco[20];
		String [] nombreCan = null;
		do
		{
			opcion = menu();
			switch(opcion)
			{
			case 1:
				
				
				int poc= Integer.parseInt(JOptionPane.showInputDialog("Ingresa posicion"));
				if(poc<disco1.length)
				{
					if(disco1[poc]!=null)
					{
						JOptionPane.showMessageDialog(null,"Ya esta opupada la posicion");
					}
					else
					{
						String nombre = JOptionPane.showInputDialog("Ingresa nombre del disco");
						float precio = Float.parseFloat(JOptionPane.showInputDialog
								("Ingresa precio del disco"));
						int numerCanciones = Integer.parseInt(JOptionPane.showInputDialog
								("Ingresa numero de canciones"));
						nombreCan = new String[numerCanciones];
						for(int i=0; i<nombreCan.length; i++)
						{
							nombreCan[i] = JOptionPane.showInputDialog
									((i+1)+" .Ingrea nombre de la cancion");	
						}
						disco1[poc] = new Disco(nombre,precio,nombreCan);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No existe la pocicion");
				}
				break;
			case 2:
				for(int i=0; i<disco1.length; i++)
				{
					if(disco1[i]!=null)
					{
						System.out.println("Pocicion en el rank "+i+". "+disco1[i].toString());
					}
				}
				break;
			case 3:
				int mayor=0;
				int pocic=0;
				for(int i=0; i<disco1.length; i++)
				{
					if(disco1[i]!=null)
					{
						if(mayor<disco1[i].getPrecio())
						{
							mayor = (int) disco1[i].getPrecio();
							pocic = i;
						}
					}
				}
				System.out.println("Disco más caro\n"+disco1[pocic]);
				break;
			case 4:
				double suma=0.0;
				for(int i=0; i<disco1.length; i++)
				{
					if(disco1[i]!=null)
					{
						suma+=disco1[i].getPrecio();
					}
				}
				JOptionPane.showMessageDialog(null,"Suma total de precios "+suma );
				break;
			case 5:
				int pocicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion a modificar"));
				if(pocicion<disco1.length)
				{
					if(disco1[pocicion]!=null)
					{
						float precio  = Integer.parseInt
								(JOptionPane.showInputDialog("Ingresa precio a actualizar"));
						disco1[pocicion].setPrecio(precio);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"No hay datos");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No existe la pocicion");
				}
				break;
			case 6:
				pocicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion a modificar"));
				if(pocicion<disco1.length)
				{
					if(disco1[pocicion]!=null)
					{
						int indice = Integer.parseInt
								(JOptionPane.showInputDialog("Indice a modificar cancion"));
						if(nombreCan[indice]!=null)
						{
							String nob [] = disco1[pocicion].getCanciones();
							//nob = disco1[pocicion].getCanciones();
							//String nombre = JOptionPane.showInputDialog("Nombre a modificar");
							nob[indice] = JOptionPane.showInputDialog("Nombre a modificar");
							disco1[pocicion].setCanciones(nob);
						}
					}
				}
				break;
			case 7:
				break;
			
			}
			
		}while(opcion!=7);
	}
	public static int menu()
	{
		int opc = Integer.parseInt(JOptionPane.showInputDialog("1.Guardar un disco"
				+ "\n2.Mostrar discos en la caja"
				+ "\n3.Disco más caro"
				+ "\n4.Suma de precios"
				+ "\n5.Modificar precio de un disco"
				+ "\n6.Modificar una canción de un disco"
				+ "\n7.Salir"));
		return opc;
	}

}
