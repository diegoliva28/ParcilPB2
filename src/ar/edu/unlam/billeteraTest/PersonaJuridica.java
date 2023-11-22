package ar.edu.unlam.billeteraTest;

public class PersonaJuridica extends Persona implements Comparable<PersonaJuridica>{

	private Integer cuit;

	public PersonaJuridica(String nombre, Integer dni,Integer CUIT) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
		this.cuit=CUIT;
	}

	public Compra generarQR(Double costo,MedioDePago medio,Integer cuil) {
	
		Compra nueva=new Compra(costo, medio,cuil,getCuit() );
		return nueva;
	}
	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	@Override
	public int compareTo(PersonaJuridica o) {
		// TODO Auto-generated method stub
		return this.cuit.compareTo(o.getCuit());
	}

	
}
