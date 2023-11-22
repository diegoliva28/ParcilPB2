package ar.edu.unlam.billeteraTest;

public class Transferencia extends Transaccion {

	public Transferencia(Integer codigo,Double monto, MedioDePago medio, Integer CUIL,Integer CUIT) {
		super(codigo, monto, medio, CUIL, CUIT);
	}
}
