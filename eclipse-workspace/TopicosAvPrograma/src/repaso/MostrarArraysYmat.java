package repaso;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MostrarArraysYmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float calif[][] = new float[2][2];
		for(int i=0; i<calif.length; i++)
		{
			for(int h=0; h<calif[i].length; h++)
			{
				calif[i][h] = Float.parseFloat(JOptionPane.showInputDialog("Ingresa caliicaions"));
			}
			
		}
		for(int i=0; i<calif.length; i++)
		{
			for(int h=0; h<calif[i].length; h++)
			{
				System.out.println(calif[i][h]);
				
			}
		}
		



	}

}
