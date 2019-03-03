package examen1;

import java.util.Arrays;

public class Disco {
	private String nombre;
	private float precio;
	private String[] canciones;
	
	public Disco()
	{
		this.nombre = "Ataraxia";
		this.precio = 100.0f;
		this.canciones = null;
	}
	
	public Disco(String nombre, float precio, String[] canciones) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.canciones = canciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String[] getCanciones() {
		return canciones;
	}

	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}

	@Override
	public String toString() {
		return "Disco [nombre=" + nombre + ", precio=" 
	+ precio + ", canciones=" + Arrays.toString(canciones) + "]";
	}
	
}
