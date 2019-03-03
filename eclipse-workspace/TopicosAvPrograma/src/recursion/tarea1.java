package recursion;

public class tarea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mayor(new int[]{1,2,3,4,5},5,Integer.MIN_VALUE));
		System.out.println(suma(new int[][]{{1,1,1,1,1},{10,1,1,1,2,11}},0,0,0));
		System.out.println(metodoZ(new int[] {23,14,1,18,1,-8,13,25,24,1,3,-1},11));
	}
	//D)...Escribe un método RECURSIVO que devuelva el elemneto mayor de un vectorde números
	//Enteros que recibe como parametro
	public static int mayor(int []v, int pos, int mayor)
	{
		if(pos==v.length || pos<0)
		{
			return mayor;
		}
		else
		{
			if(v[pos]>mayor)
			{
				mayor = v[pos];
				return mayor (v,pos+1,mayor);
			}
			else
			{
				return mayor(v,pos+1,mayor);
			}
		}
	}
	//E)Escribir un método recursivo que devuelva la suma de los elementos de una matriz cuadrada
	//que se recibe como parametro...
	//System.out.println(suma(new int[][]{{1,1,1,1,1},{1,1,1,1,1}},0,0,0));
	public static int suma(int [][]v,int ren, int col,int suma)
	{
		if(ren==v.length)
		{
			return suma;
		}else
		{
			if(col<v[ren].length)
			{
				return suma+v[ren][col]+suma(v,ren,col+1,suma);
				
			}
			else
			{
				return suma(v,ren+1,col=0,suma);
			}
		}
	}
	//metodo Z...
	public static int metodoZ(int []x , int y)
	{
		if(y<0)
			return 0;
		else
			return x[y] + metodoZ(x,y-2);
	}
}