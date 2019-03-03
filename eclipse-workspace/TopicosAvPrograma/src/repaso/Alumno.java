package repaso;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private int grupo;
	private Fecha fechaNacimiento;
	private float[] calif;
	
	
	public Alumno()
	{
		super();
		this.nombre = "Alejandro";
		this.grupo = 1;
		this.fechaNacimiento = null;
	}
	public Alumno(String nombre, int grupo, Fecha fechaNacimiento, float[] calif) {
		super();
		this.nombre = nombre;
		this.grupo = grupo;
		this.fechaNacimiento = fechaNacimiento;
		this.calif = calif;
	}
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public float[] getCalif() {
		return calif;
	}
	public void setCalif(float[] calif) {
		this.calif = calif;
	}
	public float obtenerPromedio()
	{
		float promedio=0;
		for(float ele : this.calif)
		{
			promedio+=ele;
		}
		return promedio/this.calif.length;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", \ngrupo=" + grupo + ", \nfechaNacimiento=" + fechaNacimiento + ", \ncalif="
				+ Arrays.toString(calif) + "\nPromedio: "+this.obtenerPromedio()+"]\n";
	}
	
	
}