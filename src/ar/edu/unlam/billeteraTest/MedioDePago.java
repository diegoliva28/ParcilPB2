package ar.edu.unlam.billeteraTest;

public abstract class MedioDePago {
	private Integer identificador;
	private Double saldo;

	public MedioDePago(Integer identificador) {
		super();
		this.identificador = identificador;
		this.saldo=0.0;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Double saldo) {
		this.saldo+=saldo;
	};
	
	public abstract Boolean extraer(Double monto) throws SaldoInsuficineteException, ExcedeLimiteDeCompraException;
}
