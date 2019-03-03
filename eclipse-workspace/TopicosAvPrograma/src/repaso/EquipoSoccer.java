package repaso;

import java.util.Arrays;

public class EquipoSoccer{
	//DECLARACIÓN DE ATRIBUTOS...
	private Fecha fechaCreacion;
	private String nombre;
	private int puntos;
	private String[] jugadores;
	public EquipoSoccer()
	{
		this.nombre = "Chivas";
		this.puntos = 10;
		this.jugadores = null;
	}
	public EquipoSoccer(String nombre, int puntos, String[] jugadores) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.jugadores = jugadores;

	}
	public EquipoSoccer(String nombre, int puntos, String[] jugadores,Fecha fech) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.jugadores = jugadores;
		this.fechaCreacion = fech;
	}
	public String getNombre() {
		return nombre; 
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public String[] getJugadores() {
		return jugadores;
	}
	public void setJugadores(String[] jugadores) {
		this.jugadores = jugadores;
	}
	
	public Fecha getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Fecha fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	@Override
	public String toString() {
		return "EquipoSoccer [nombre=" + nombre + ", puntos=" +
	puntos + ", jugadores=" + Arrays.toString(jugadores)
				+this.fechaCreacion.toString()+ "]";
	}
}
