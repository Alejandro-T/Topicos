package repaso;

import javax.swing.JOptionPane;

import examen1.Disco;

public class Examen1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0;
		int rank=0;
		String [] canciones = null;
		Disco biblioteca[] = new Disco[20];
		do
		{
			opc = menu();
			switch(opc)
			{
			case 1:
				rank = Integer.parseInt(JOptionPane.showInputDialog
						("Ingresa posicion en el rank"));
				if(rank<biblioteca.length)
				{
					
					if(biblioteca[rank]!=null)
					{
						JOptionPane.showMessageDialog(null,"Ya hay un disco en es posición");
					}
					else {
						String nombre = JOptionPane.showInputDialog("Ingresa nombre del disco");
						float precio = Float.parseFloat
								(JOptionPane.showInputDialog("Ingresa precio del disco"));
						byte numCanciones = Byte.parseByte
								(JOptionPane.showInputDialog("Ingresa numero de canciones"));
						canciones = new String [numCanciones];
						for(int i=0; i<canciones.length; i++)
						{
							canciones[i] = JOptionPane.showInputDialog
									((i)+".Nombre de canción");
						}
						biblioteca[rank] = new Disco(nombre,precio,canciones);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No existe la posición");
				}
				break;
			case 2:
				for(int j=0; j<biblioteca.length; j++)
				{
					if(biblioteca[j]!=null)
					{
						System.out.println("Posicion en el ranck "+j+" ."+biblioteca[j].toString());
					}
				}
				break;
			case 3:
				float mayor = 0.0f;
				int poc=0;
				for(int j=0; j<biblioteca.length; j++)
				{
					if(biblioteca[j]!=null)
					{
						if(mayor<biblioteca[j].getPrecio())
						{
							mayor = biblioteca[j].getPrecio();
							poc = j;
						}
					}
				}
				System.out.println("Disco más caro "+poc+" ."+biblioteca[poc].toString());
				break;
			case 4:
				float suma = 0.0f;
				for(int i=0;  i<biblioteca.length; i++)
				{
					if(biblioteca[i]!=null)
					{
						suma+=biblioteca[i].getPrecio();
					}
				}
				JOptionPane.showMessageDialog(null,"Suma total de los discos "+suma);
				break;
			case 5:
				rank = Integer.parseInt(JOptionPane.showInputDialog("Ingresa posicion"));
				if(rank<biblioteca.length)
				{
					if(biblioteca[rank]!=null)
					{
						float precioN = Float.parseFloat
								(JOptionPane.showInputDialog("Ingresa nuevo precio"));
						biblioteca[rank].setPrecio(precioN);
					}
				}
				break;
			case 6:
				rank = Integer.parseInt(JOptionPane.showInputDialog("Ingresa posición"));
				if(rank<biblioteca.length)
				{
					if(biblioteca[rank]!=null)
					{
						byte posCancion = Byte.parseByte
								(JOptionPane.showInputDialog("Ingresa posicion de la cancion"));
						if(posCancion < canciones.length)
						{
							String [] nuevoPlayList =  new String [canciones.length];
							nuevoPlayList = biblioteca[rank].getCanciones();
							nuevoPlayList[posCancion] = JOptionPane.showInputDialog
									("Ingresa nombre a cambiar");
							biblioteca[rank].setCanciones(nuevoPlayList);
						}else {
							JOptionPane.showMessageDialog(null,"No existe la canción en el disco");
						}
					}
				}
				break;
			}
		}while(opc!=7);
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