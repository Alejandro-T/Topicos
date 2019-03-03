package objetosBidi;

public class Materia {
	private String clave;
	private String nombre;
	private byte creditos;
	private String maestro;
	public Materia()
	{
		this.clave = "Cfe3";
		this.nombre = "Matematcias I";
		this.creditos = 5;
		this.maestro = "Busciaga";
	}
	
	public Materia(String clave, String nombre, byte creditos, String maestro) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.creditos = creditos;
		this.maestro = maestro;
	}

	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getCreditos() {
		return creditos;
	}
	public void setCreditos(byte creditos) {
		this.creditos = creditos;
	}
	public String getMaestro() {
		return maestro;
	}
	public void setMaestro(String maestro) {
		this.maestro = maestro;
	}

	@Override
	public String toString() {
		return "Materia [clave=" + clave + ", nombre=" + nombre + ", creditos=" + creditos + ", maestro=" + maestro
				+ "]";
	}
	
}
