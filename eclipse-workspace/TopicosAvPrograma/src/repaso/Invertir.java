package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Invertir {

	public static void main(String[] args) {
		//DECLARACIÓN DE VAIABLES...
		int ren=0,col=0;
		Scanner leer = new Scanner(System.in);
		System.out.print("renglones ");
		ren = leer.nextInt();
		System.out.print("columnas ");
		col = leer.nextInt();
		
		float [] [] a = new float[ren][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print((i)+"."+j+". ");
				a[i][j] = leer.nextFloat();
			}
		}
		float b [] [] = new float[col][ren];
	System.out.println("Matriz transupuesta");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				b[i][j] = a[j][i];
			}
			System.out.println(Arrays.toString(b[i]));
		}
		leer.close();
		/*for(int i=0; i<b.length; i++)
		{
			System.out.println(Arrays.toString(b[i]));
		}*/
	}
}