package ar.edu.unlam.billeteraTest;

import java.util.Objects;

public class CuentaVirtual extends MedioDePago implements Pagadora, Transferible{

	private Integer CVU;

	public CuentaVirtual(Integer identificador) {
		super(identificador);
		this.CVU=identificador;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Boolean pagar(Persona Vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getCVU() {
		return CVU;
	}



	public void setCVU(Integer cVU) {
		CVU = cVU;
	}


	@Override
	public int hashCode() {
		return Objects.hash(CVU);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaVirtual other = (CuentaVirtual) obj;
		return Objects.equals(CVU, other.CVU);
	}
}
