package ar.edu.unlam.billeteraTest;

import java.util.Objects;

public class TarjetaDeCredito extends MedioDePago implements Pagadora{

	private Integer numeroDeTarjeta;
	private Double descubierto;

	public TarjetaDeCredito(Integer identificador, Double descubierto) {
		super(identificador);
		this.numeroDeTarjeta=identificador;
		this.descubierto=descubierto;
		// TODO Auto-generated constructor stub
	}
	
	public Integer getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}
	
	@Override
	public Boolean pagar(Persona Vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNumeroDeTarjeta(Integer numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}


	public Double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}



	@Override
	public int hashCode() {
		return Objects.hash(numeroDeTarjeta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaDeCredito other = (TarjetaDeCredito) obj;
		return Objects.equals(numeroDeTarjeta, other.numeroDeTarjeta);
	}
	
	
}
