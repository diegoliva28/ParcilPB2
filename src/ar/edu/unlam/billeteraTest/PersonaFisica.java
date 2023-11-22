package ar.edu.unlam.billeteraTest;

public class PersonaFisica extends Persona implements Comparable<PersonaFisica>{

	private Integer cuil;

	public PersonaFisica(String nombre, Integer dni,Integer CUIL) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
		this.cuil=CUIL;
	}

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}

	@Override
	public int compareTo(PersonaFisica o) {
		// TODO Auto-generated method stub
		return this.cuil.compareTo(o.getCuil());
	}

	
}
