package repaso;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARACIÓN DE VAIRABLES...
		int opcion=0;
		int tamanio=0;
		int [][] matriz2 = null;
		do
		{
			opcion = menu();
			switch(opcion)
			{
				case 1:
					tamanio = Integer.parseInt(JOptionPane.showInputDialog
							("Ingresa tamañio de la matriz"));
					matriz2=matriz(tamanio);
					break;
				case 2:
					mostrar(matriz2);
					break;
				case 3:
					JOptionPane.showMessageDialog
					(null,"Suma total de la matriz: "+suma(matriz2));
					
					break;
				case 4:
					vector(matriz2);
					break;
				case 5:
					System.out.println(cuadradoMagico(matriz2));
					break;
			
			}
		}while(opcion!=6);
		
	}
	public static int menu()
	{
		int opc = Integer.parseInt(JOptionPane.showInputDialog
				("1.Captura de datos"
						+ "\n2.Desplegar matriz"
						+ "\n3.Desplegar suma total"
						+ "\n4.Desplegar suma de filas"
						+ "\n5.Cuadrado mágico"
						+ "\n6.Salir"));
		return opc;
	}
	public static int [][] matriz(int tamaño)
	{
		int matriz[][];
		matriz = new int [tamaño][tamaño];
		for(int i=0; i<matriz.length; i++)
		{
			for(int j=0; j<matriz[i].length; j++)
			{
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog
						((i)+"."+(j)+"."+"Ingresa matriz: "));
			}
		}
		return matriz;	
	}
	public static void mostrar(int matriz[][])
	{
		for(int i=0; i<matriz.length; i++)
		{
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
	public static int suma(int matriz[][])
	{
		int suma=0;
		for(int i = 0; i<matriz.length; i++)
		{
			for(int j=0; j<matriz[i].length; j++)
			{
				suma+=matriz[i][j];
			}
		}
		return suma;
	}
	public static int[] vector (int [][]matriz)
	{
		int [] vector = null;
		for(int i = 0; i<matriz.length; i++)
		{
			vector = new int [matriz.length];
			for(int j=0; j<matriz[i].length; j++)
			{
				vector[i]+= matriz[i][j];
			}
			System.out.println(vector[i]);
		}
		return vector;
	}
	//Meotod para poder regresar un boolean si es si
	//Elcuadrado es magico y retorna true,
	//de ser lo clontarrio regresa false.
	public static boolean cuadradoMagico(int [][]matriz)
	{
		int sumaFi=0;
		int sumaCol=0;
		int count=0;
		for(int i = 0; i<matriz.length; i++)
		{
			sumaFi=0;
			sumaCol=0;
			for(int j=0; j<matriz[i].length; j++)
			{
				sumaFi+=matriz[i][j];
				sumaCol+=matriz[j][i];
			}
			if(sumaFi==sumaCol)
			{
				count++;
				if(count==matriz.length)
				{
					return true;
				}
			}
			System.out.println
			("Suma filas "+sumaFi+"\nSuma columnas "+sumaCol);
		}
		return false;
	}
}