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
	public Double getSaldo() {
		return this.descubierto;
	}
	
	@Override
	public void depositar(Double monto) {
		this.descubierto+=monto;
	}
	
	@Override
	public Boolean pagar(Compra compra, Double importe) throws ExcedeLimiteDeCompraException {
//		if(this.extraer(importe)) {
		if(this.descubierto>=compra.getMonto()) {
			compra.SePago();
			return true;
		}
		
		return false;
	}
	//Si este da true, tengo que depositar en el vendedor

	@Override
	public Boolean extraer(Double monto) throws ExcedeLimiteDeCompraException  {
		// TODO Auto-generated method stub
		if(monto>this.descubierto) {
			throw new ExcedeLimiteDeCompraException();
		}
		this.descubierto=this.descubierto-monto;
		
		return true;
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
