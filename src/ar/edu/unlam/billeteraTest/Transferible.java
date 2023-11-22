package ar.edu.unlam.billeteraTest;

public interface Transferible {
Double getSaldo();
void depositar(Double importe);
Boolean extraer(Double importe);
}
