package repaso;

public class recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num []= {1,2,3,4,5};
		for(int i = num.length-1; i>=0; i--)
		{
			System.out.println(num[i]);
		}*/
		/*System.out.println(suma(10));
		recorrido(new int[]{1,2,3},0);
		System.out.println(formaRecursiva(new int[] {1,2,3,4,5},1,0));
		recorrerMatrz(new int [][]{{1,2,3},{4}},0,0);
		String palabra = "Hola";
		System.out.println(invertirPalabra(palabra,palabra.length()-1));*/
		bajarEscalon(10);
	}
	//sumar los numeros hasta N(se lo damos nosotros)de manera recursiva
	public static void bajarEscalon(int n)
	{
		if(n==0)
		{
			System.out.print("Has bajado la escalera");
		}
		else
		{
			System.out.println("Te encuentras en el escalon "+n+"\nBajando escalón");
			bajarEscalon(n-1);
		}
	}
	public static int suma(int n)
	{
		int res;
		if(n==1)
		{
			return 1;
		}
		else
		{
			res = n + suma(n-1);
			return res;
		}
	}
	public static void recorrido(int []array,int poc)
	{
		if(poc>=array.length)
		{
			System.out.println("Ciclo acabado");
		}
		else
		{
			System.out.println(array[poc]);
			recorrido(array,poc+1);
			
		}
	}
	//Buscar un elemento en el array de forma recursiva...
	public static int formaRecursiva(int[]array, int buscar,int indice)
	{
		if(buscar<array.length)
		{
			if(buscar==array[indice])
			{
				return buscar;
			}
			else {
				return formaRecursiva(array,buscar,indice+1);
			}
		}
		else
		{
			return 0;
		}
	}
	//Recorrer una matriz de manera recuriva
	public static void recorrerMatrz(int [][] matriz,int primario, int secundario)
	{
		if(primario<matriz.length)
		{
			if(secundario<matriz[primario].length)
			{
				System.out.print(matriz[primario][secundario]);
				recorrerMatrz(matriz,primario,secundario+1);
			}
			else
				recorrerMatrz(matriz,primario+1,secundario=0);
		}
		else
		{
			System.out.print("Programa terminado...");
		}
		/*if(primario == matriz.length)
		{
			System.out.println(" Se ha recorrido la matriz");
		}
		else
		{
			if(secundario<matriz[primario].length)
			{
				System.out.print(matriz[primario][secundario]);
				recorrerMatrz(matriz,primario,secundario+1);
			}
			else
			{
				recorrerMatrz(matriz,primario+1,secundario=0);
			}
		}*/
	}
	public static String invertirPalabra(String str,int indice)
	{
		if(indice==0)
		{
			return str.charAt(indice)+"";
		}
		else
		{
			
			return str.charAt(indice) + invertirPalabra(str,indice-1);
		}
	}
}