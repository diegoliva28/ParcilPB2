package ar.edu.unlam.billeteraTest;

public class Compra extends Transaccion {

	private boolean pagada;

	public Compra(Integer codigo,Double monto, MedioDePago medio, Integer CUIL,Integer CUIT) {
		super(codigo,monto, medio, CUIL, CUIT);
		this.pagada=false;
		// TODO Auto-generated constructor stub
	}
	public void SePago() {
		this.pagada = true;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	

	
	

}
