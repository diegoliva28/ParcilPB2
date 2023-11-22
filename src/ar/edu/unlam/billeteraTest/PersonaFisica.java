package ar.edu.unlam.billeteraTest;

public class PersonaFisica extends Persona{

	private Integer cuil;

	public PersonaFisica(String nombre, Integer dni,Integer CUIL) {
		super(nombre, dni,CUIL);
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
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.cuil.compareTo(o.getIdentificar());
	}

	
}
