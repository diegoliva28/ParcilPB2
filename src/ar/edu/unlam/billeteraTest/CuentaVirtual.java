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
	public Boolean pagar(Compra compra, Double importe) throws SaldoInsuficineteException {
		if(importe>getSaldo()) {
			throw new SaldoInsuficineteException();
		}
		
		setSaldo(getSaldo()-importe);
		compra.SePago();
		
		return true;
	}



	@Override
	public Boolean extraer(Double importe){
		if(importe>super.getSaldo()) {
		}
		setSaldo(getSaldo()-importe);
		return true;
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
