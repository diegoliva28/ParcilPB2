package ar.edu.unlam.billeteraTest;

public class Compra extends Transaccion {

	private boolean pagada;
	private Integer vendedor;
	private Integer comprador;
	private MedioDePago medio;

	public Compra(Double monto, MedioDePago medio, Integer CUIL,Integer CUIT) {
		super(monto);
		this.pagada=false;
		this.medio=medio;
		this.vendedor=CUIT;
		this.comprador=CUIL;
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
	
	public Integer getVendedor() {
		return vendedor;
	}
	public void setVendedor(Integer vendedor) {
		this.vendedor = vendedor;
	}
	public Integer getComprador() {
		return comprador;
	}
	public void setComprador(Integer comprador) {
		this.comprador = comprador;
	}
	public MedioDePago getMedio() {
		return medio;
	}

	public void setMedio(MedioDePago medio) {
		this.medio = medio;
	}
	
	

}
