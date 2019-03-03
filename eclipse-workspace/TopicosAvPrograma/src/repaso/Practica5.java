package repaso;

import javax.swing.JOptionPane;

public class Practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Tamño"));
		int a[][] = new int [tam][tam];
		System.out.println(mu(a,tam));

	}
	public static boolean mu(int m[][],int tam)
	{
		
		m = new int [tam][tam];
		for(int i=0; i<m.length; i++)
		{
			for(int j=0; j<m[i].length; j++)
			{
				
				m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("1."));
			}
		}
		int dia=0;
		for(int i=0; i<m.length; i++)
		{
			for(int j=0; j<m[i].length; j++)
			{
				if(i==j)
				{
					if(m[i][j]==1)
					{
						dia++;
						if(dia==m.length)
						{
							return true;
						}
						
					}
					else
					{
						return false;
					}
					
				}
				else
				{
					if(m[i][j]!=0)
					{	
						return false;
					}
				}
			}
		}
		return false;
	}
}