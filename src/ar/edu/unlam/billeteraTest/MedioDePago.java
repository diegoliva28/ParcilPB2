package ar.edu.unlam.billeteraTest;

public abstract class MedioDePago {
	private Integer identificador;

	public MedioDePago(Integer identificador) {
		super();
		this.identificador = identificador;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	
}
