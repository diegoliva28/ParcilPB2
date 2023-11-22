package ar.edu.unlam.billeteraTest;

public class CajaDeAhorro extends CuentaBancaria {

	private Double descubierto;

	public CajaDeAhorro(Integer identificador, Double descubierto) {
		super(identificador);
		this.descubierto=descubierto;
		// TODO Auto-generated constructor stub
	}

	public Double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}
	
	

}
