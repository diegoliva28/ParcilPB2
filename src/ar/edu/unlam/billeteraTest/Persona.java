package ar.edu.unlam.billeteraTest;

public abstract class Persona implements Comparable<Persona>{
	private String nombre;
	private Integer dni;
	private Integer identificar;
	public Persona(String nombre, Integer dni, Integer identificador) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.identificar=identificador;
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
	public Integer getIdentificar() {
		return identificar;
	}
	public void setIdentificar(Integer identificar) {
		this.identificar = identificar;
	}
	
	
	
}
