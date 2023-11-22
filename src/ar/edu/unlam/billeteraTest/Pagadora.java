package ar.edu.unlam.billeteraTest;

public interface Pagadora {
	// Persona vendedor= persona jurifica
	Boolean pagar(Compra compra, Double importe) throws ExcedeLimiteDeCompraException, SaldoInsuficineteException;
	
	Double getSaldo();

}
