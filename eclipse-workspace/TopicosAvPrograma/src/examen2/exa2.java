package examen2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import javax.swing.JOptionPane;

public class exa2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String matrizLetras [][] = 
			{{"A","H","B","R"},{"C","O","U","I"}, 
			{"S","T","L","Q"},{"","E","N","Y"}};
		int matrisDirecciones[][] = {{10,01,31,13},{03,22,12,30}
		,{32,02,21,11},{20,23,00,33}};
		String cadena="";
		BufferedReader entrada = new BufferedReader(new FileReader("src\\examen2\\ent.txt"));
		PrintWriter salida = new PrintWriter(new FileWriter("src\\examen2\\salida.txt"));
		String cad1="";
		Stack <Integer> pila = new Stack<Integer>();
		//cadena = JOptionPane.showInputDialog("Ingresa cadena");
		while(entrada.ready())
		{
			cadena = entrada.readLine();
			for(int i=0; i<cadena.length(); i+=2)
			{
				if(i<cadena.length())
				{
					pila.push(Integer.parseInt(cadena.substring(i,i+1)));
					pila.push(Integer.parseInt(cadena.substring(i+1,i+2)));
					int ultimo = pila.pop();
					int anterior = pila.pop();
					pila.push(matrisDirecciones[anterior][ultimo]);
					int primero,segundo;
					primero = pila.peek()/10;
					segundo = pila.peek()%10;
					cad1=cad1+matrizLetras[primero][segundo];
					pila.pop();
				}
				
			}
		}
		System.out.println(cad1);
		salida.print(cad1);
		salida.close();
	}
}
