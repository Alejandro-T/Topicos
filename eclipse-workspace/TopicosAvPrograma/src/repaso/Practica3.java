package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a
		float [][] a = new float[3][2];
		int mayor = Integer.MIN_VALUE;
		Scanner leer = new Scanner(System.in);
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a[i].length; j++)
			{
				System.out.print((i+"."+j+" Valor float:"));
				a[i][j] = leer.nextFloat();
			}
		}
		//b
		int [][] b = new int[5][];
		for(int i=0; i<b.length; i++)
		{
			b[i] = new int[i+1];
			for(int j = 0; j<b[i].length; j++)
			{
				b[i][j] = (i+1);
			}
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.println(Arrays.toString(b[i]));
		}
		//c
		System.out.println();
		int c [][] = {{23},{45,57,87,10},{51,60,74},{43,87,90,11,24},
				{35,47,80},{80,44}};
		for(int i=0; i<c.length; i++)
		{
			System.out.println(Arrays.toString(c[i]));
		}
		int suma=0;
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				suma+=c[i][j];
			}
		}
		System.out.println("Suma de toda la matriz: "+suma);
		int suma2=0;
		for(int i=0; i<c.length;i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				if(i==3)
				{
					c[i][j] +=10;
					suma2+=c[i][j]+10;
				}
				else
				{
					suma2+=c[i][j];
				}
				
				
			}
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.println(Arrays.toString(c[i]));
		}
		System.out.println("Suma modificada: "+suma2);
		
	}

}
