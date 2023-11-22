package ar.edu.unlam.billeteraTest;

import java.util.Objects;

public class CuentaBancaria extends MedioDePago implements Transferible{

	private Integer CBU;

	public CuentaBancaria(Integer identificador) {
		super(identificador);
		this.CBU=identificador;
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
	
	public Integer getCBU() {
		return CBU;
	}

	public void setCBU(Integer cBU) {
		CBU = cBU;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CBU);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(CBU, other.CBU);
	}
}
