package ar.edu.unlam.billeteraTest;

public class Transaccion {
	private Double monto;
	private Integer vendedor;
	private Integer comprador;
	private MedioDePago medio;
	private Integer codigo;

	public Transaccion(Integer codigo,Double monto,MedioDePago medio, Integer CUIL,Integer CUIT) {
		super();
		this.codigo=codigo;
		this.monto = monto;
		this.medio=medio;
		this.vendedor=CUIT;
		this.comprador=CUIL;
}

	
	
	public Integer getCodigo() {
		return codigo;
	}



	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
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
