package ar.edu.unlam.billeteraTest;

public abstract class Persona {
	private String nombre;
	private Integer dni;
	public Persona(String nombre, Integer dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
}
