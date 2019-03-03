package repaso;

import javax.swing.JOptionPane;

public class Main2 {
	public static void main(String[]args)
	{
		//DECLARACIÓN DE VARIBALES...
		int i, pt , nj, j;
		String nom, vj[];
		int dia=0,mes=0,año=0;
		
		//a
		EquipoSoccer ligaEuropea[] = new EquipoSoccer[8];
		
		for(i=0; i<1; i++) 
		{
			nom = JOptionPane.showInputDialog((i+1)+".Nombre del equipo: ");
			dia = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Ingresa dia de "
					+ "creacion del equipo:"));
			mes = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Ingresa mes de "
					+ "creacion del equipo:"));
			año = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Ingresa año de "
					+ "creacion del equipo:"));
			pt = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Pts del equipo: "));
			nj = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Numero de jugadores:"));
			vj = new String[nj];
			for(j = 0; j<vj.length; j++)
			{
				vj[j] = JOptionPane.showInputDialog((j+1)+".Nombre del jugador: ");
			}
			
			ligaEuropea[i] = new EquipoSoccer(nom,pt,vj,new Fecha(dia,mes,año));
			System.out.println(ligaEuropea[i]);
		}
		//c)
		String vj2[] = {"Mario","Carlos","Rodrigo","CR7"};
		ligaEuropea[ligaEuropea.length-1] = new EquipoSoccer("Monterrey",10,vj2);
		//System.out.println(ligaEuropea[ligaEuropea.length-1]);
		//d)
		int suma = 0;
		for(i =0; i<ligaEuropea.length; i++)
		{
			if(ligaEuropea[i]!=null)
				suma+= ligaEuropea[i].getPuntos();
		}
		JOptionPane.showMessageDialog(null,"Suma total: "+suma);
	}
}