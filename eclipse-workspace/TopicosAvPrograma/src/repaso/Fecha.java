package repaso;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;

	public Fecha ( )  {
		dia = mes=a�o = 0;
	}

	public Fecha ( int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public int getDia ( ) {
		return dia;
	}

	public int getMes ( ) {
		return mes;
	}

	public int getA�o ( ) {
		return a�o;
	}
	
	public void setDia ( int dia) {
		this.dia = dia;
	}

	public void setMes ( int mes) {
		this.mes = mes;
	}

	public void setA�o ( int a�o) {
		this.a�o = a�o;
	}

	public String toString ( ) {
	     return "Fecha [" + dia + "/" + mes + "/" + a�o + "]";
	}
}