package recursion;

import javax.swing.JOptionPane;

public class Practica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do
		{
			opcion = menu();
			switch(opcion)
			{
			case 1:
				int fibo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero"));
				System.out.println("Serie fibonacci: "+fibonacci(fibo));
				break;
			case 2:
				System.out.println(mcd(1032,180));
				break;
			case 3:
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero:"));
				System.out.println("Suma del numero: "+sumaDigitos(numero));
				break;
			case 4: 
				System.out.println(impares(new int [] {1,2,3,4,5,9,6,8,12,43,56,78,111,33},0));
				break;
			case 5:
				System.out.println(sumaMultiplos(new int[] {1,3,6,44,2,9,12,10,14,15,18,19},0));
				break;
			case 6:
				System.out.println(elementoMenor(new int [] {2,5,1,3,4,5,6,7,-11,3,5,8},0,Integer.MAX_VALUE));
				break;
			}
			
		}while(opcion!=7);
	}
	public static int menu()
	{
		int opc = Integer.parseInt(JOptionPane.showInputDialog("1.Fibonaci del n-esimo término"
				+ "\n2.Maximo comun divisor de 2 enteros"
				+ "\n3,suma los digitos de un numero entero"
				+ "\n4.contar numeros impartes en un vector"
				+ "\n5.Suma de los multiplos de 3 de un vector"
				+ "\n6.Encontrar elemento menor en un vector"
				+ "\n7.Terminar"));
		return opc;
	}
	public static int impares(int []array,int poc)
	{
		if(poc<array.length)
		{
			if(array[poc]%2==1)
			{
				return 1+ impares(array,poc+1);
				
			}
			else
			{
				return 0+impares(array,poc+1);
			}
		}
		else {
			return 0;
		}
		
	}
	public static long fibonacci(long n)
	{
		if(n>=2)
		{
			return fibonacci(n-1)+(fibonacci(n-2));
		}
		else
		{
			return n;
		}
		
	}
	public static int sumaMultiplos(int []array,int poc)
	{
		if(poc<array.length)
		{
			if(array[poc]%3==0)
			{
				return array[poc]+sumaMultiplos(array,poc+1);
				
			}
			else
				return 0+sumaMultiplos(array,poc+1);
		}
		else
		{
			return 0;
		}
	}
	public static int mcd(int a, int b)
	{
		if(a % b ==0)
		{
			return b;
		}
		else
		{
			return mcd(b,a%b);
		}
	}
	public static int sumaDigitos(int a)
	{
		if(a<=10)
		{
			return a;
		}
		else
		{
			return a%10+sumaDigitos(a/10);
			
		}
	}
	
	//encontrar el elemento menor en un vector.
	public static int elementoMenor(int array[],int poc, int menor)
	{
		if(poc<array.length)
		{
			if(array[poc]<menor)
			{
				menor = array[poc];
				return elementoMenor(array,poc+1,menor);
				
			}
			else {
				return elementoMenor(array,poc+1,menor);
			}
		}
		else {
			return menor;
		}
		
	}
}
