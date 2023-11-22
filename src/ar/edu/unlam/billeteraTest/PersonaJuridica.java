package ar.edu.unlam.billeteraTest;

public class PersonaJuridica extends Persona {

	private Integer cuit;

	public PersonaJuridica(String nombre, Integer dni,Integer CUIT) {
		super(nombre, dni, CUIT);
		// TODO Auto-generated constructor stub
		this.cuit=CUIT;
	}

	public Compra generarQR(Integer codigo,Double costo,MedioDePago medioDelVendedor,Integer cuil) {
	
		Compra nueva=new Compra(codigo,costo, medioDelVendedor,cuil,getCuit() );
		return nueva;
	}
	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.cuit.compareTo(o.getIdentificar());
	}

	
}
