package examen2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

import javax.swing.JOptionPane;

public class examen2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String matrizLetras [] [] = 
			{{"A","H","B","R"},{"C","O","U","I"},{"S","T","L","Q"},{"","E","N","Y"}};
		int matrizDirecciones [] [] = {{10,01,31,13},{03,22,12,30},{32,02,21,11},{20,23,00,33}};
		BufferedReader entrada = new BufferedReader
				(new FileReader("src\\examen2\\ent.txt"));
		String cadena="";
		int ren=0;
		int col=0;
		int poc=0;
		String cadena2="";
		//Sin texto.....
		cadena = JOptionPane.showInputDialog("Ingresa cadena");
		for(int i=0; i<cadena.length(); i+=2)
		{
			if(i<cadena.length()-1)
			{
				poc = matrizDirecciones[Integer.parseInt(cadena.substring(i,i+1))]
						[Integer.parseInt(cadena.substring(i+1,i+2))];
				int primero,segundo;
				primero = poc/10;
				segundo = poc%10;
				//b = Integer.parseInt(a.substring(i,i+1));
				//cadena2+=matrizLetras[Integer.parseInt(a.substring(i,i+1))]
					//	[Integer.parseInt(a.substring(i+1,i+2))];
				cadena2+=matrizLetras[primero]
							[segundo];
			}
		}
		System.out.println(cadena2);
		//Con Buffered reader
		/*while(entrada.ready())
		{
			String dato = entrada.readLine();
			for(int i=0; i<dato.length(); i+=2)
			{
				if(i<dato.length()-1)
				{
					poc = matrizDirecciones[Integer.parseInt(dato.substring(i,i+1))]
							[Integer.parseInt(dato.substring(i+1,i+2))];
					int primero,segundo;
					primero = poc/10;
					segundo = poc%10;
					//b = Integer.parseInt(a.substring(i,i+1));
					//cadena2+=matrizLetras[Integer.parseInt(a.substring(i,i+1))]
						//	[Integer.parseInt(a.substring(i+1,i+2))];
					cadena2+=matrizLetras[primero]
								[segundo];
				}
			}
		}*/
		System.out.println(cadena2);
	}
}