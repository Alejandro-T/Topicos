package objetosBidi;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Materia[][] semestre1;
		byte carga = Byte.parseByte(JOptionPane.showInputDialog("Ingresa carga academica"));
		semestre1 = new Materia[carga][1];
		String clave ="";
		String nombre = "";
		byte creditos=0;
		String maestro="";
		for(int i=0; i<semestre1.length; i++)
		{
			for(int j=0; j<semestre1[i].length; j++)
			{
				clave = JOptionPane.showInputDialog("Ingresa clave");
				nombre = JOptionPane.showInputDialog("Ingresa Nombre");
				creditos = Byte.parseByte
						(JOptionPane.showInputDialog("Ingresa Creditos"));
				maestro = JOptionPane.showInputDialog("Ingresa nombre del maestros");
				/**
				 * semestre1[i][j].setClave(JOptionPane.showInputDialog("Ingresa clave"));
				semestre1[i][j].setNombre(JOptionPane.showInputDialog("Ingresa nombre"));
				semestre1[i][j].setCreditos(Byte.parseByte
						(JOptionPane.showInputDialog("Ingresa Creditos")));
				semestre1[i][j].setMaestro(JOptionPane.showInputDialog("Ingresa Maestro"));
				 */
				semestre1[i][j] = new Materia(clave,nombre,creditos,maestro);
			}
		}
		for(int i=0; i<semestre1.length; i++)
		{
			System.out.println(Arrays.toString(semestre1[i]));
		}
	}

}
