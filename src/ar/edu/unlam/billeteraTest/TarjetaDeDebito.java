package ar.edu.unlam.billeteraTest;

import java.util.Objects;

public class TarjetaDeDebito extends MedioDePago implements Pagadora{

	private Integer numeroDeTarjeta;

	public TarjetaDeDebito(Integer identificador) {
		super(identificador);
		this.numeroDeTarjeta=identificador;
		// TODO Auto-generated constructor stub
	}

	
	public Integer getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}


	public void setNumeroDeTarjeta(Integer numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	

	@Override
	public Boolean pagar(Persona Vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
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
		TarjetaDeDebito other = (TarjetaDeDebito) obj;
		return Objects.equals(numeroDeTarjeta, other.numeroDeTarjeta);
	}
	
	
	
}
