package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.billeteraTest.Billetera;
import ar.edu.unlam.billeteraTest.Compra;
import ar.edu.unlam.billeteraTest.CuentaVirtual;
import ar.edu.unlam.billeteraTest.MedioDePago;
import ar.edu.unlam.billeteraTest.Persona;
import ar.edu.unlam.billeteraTest.PersonaFisica;
import ar.edu.unlam.billeteraTest.PersonaJuridica;
import ar.edu.unlam.billeteraTest.SaldoInsuficineteException;
import ar.edu.unlam.billeteraTest.TarjetaDeCredito;
import ar.edu.unlam.billeteraTest.TarjetaDeDebito;
import ar.edu.unlam.billeteraTest.Transaccion;
import ar.edu.unlam.billeteraTest.Transferencia;

public class testBilletera {

	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDeTransacciones() {
		//1
		
		Billetera MP=new Billetera();
		
		
		//2
		
		Transaccion nueva=new Compra(1,200.0, null, null, null);
		Transaccion nueva2=new Transferencia(2,null, null, null, null);
		MP.almacenarTransaccion(nueva);
		MP.almacenarTransaccion(nueva2);
		Integer cantidad=2;
		Integer cantidadObtenida=MP.getTransacciones().size();
		//3
		assertNotNull(MP);
		assertEquals(cantidad, cantidadObtenida);
	}
	
	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDePersonas() {
		//1
		
		Billetera MP=new Billetera();
		String nombre="diego";
		//2
		Persona nueva=new PersonaFisica(nombre, 123, 1234);
		Persona nueva2=new PersonaFisica(nombre, 123, 1234);
		Persona nuevaJ=new PersonaJuridica(nombre, 123, 1235);
		Persona nuevaJ2=new PersonaJuridica(nombre, 123, 1234);
		MP.almacenarPersona(nuevaJ);
		MP.almacenarPersona(nuevaJ2);
		MP.almacenarPersona(nueva);
		MP.almacenarPersona(nueva2);
		Integer cantidad=2;
		Integer cantidadObtenida=MP.getPersonas().size();
		//3
		assertNotNull(MP);
		assertEquals(cantidad, cantidadObtenida);
	}
	
	@Test
	public void queSePuedanAsociarACadaPersonaASusMedios() {
		//1
		
		Billetera MP=new Billetera();
		String nombre="diego";
		//2
		MedioDePago tarjateC=new TarjetaDeCredito(12345, 100.0);
		MedioDePago tarjateD=new TarjetaDeDebito(1234);
		
		Persona nueva=new PersonaFisica(nombre, 123, 1234);
		Persona nuevaJ=new PersonaJuridica(nombre, 123, 1235);
		MP.almacenarPersona(nuevaJ);
		MP.almacenarPersona(nueva);
		
		MP.almacenarPersonaConMedio(tarjateC,nueva);
		MP.almacenarPersonaConMedio(tarjateD,nueva);
		MP.almacenarPersonaConMedio(tarjateC,nuevaJ);
		Integer cantidad=2;
		Integer cantidadObtenida=MP.getListaDeMediosDePagoPorPersona().size();
		//3
		assertNotNull(MP);
		assertEquals(cantidad, cantidadObtenida);
	}
	
	@Test
	public void queSePuedanRealizarCompras() {
		//1
		
		Billetera MP=new Billetera();
		String nombre="diego";
		//2
		MedioDePago cuentaConsumidor=new CuentaVirtual(12345);
		cuentaConsumidor.depositar(200.0);
		MedioDePago tarjetaVendedor=new TarjetaDeDebito(12346);
		
		PersonaJuridica vender=new PersonaJuridica(nombre, 123, 1235);
		Persona consu=new PersonaFisica(nombre, 123, 1234);
		MP.almacenarPersona(consu);
		MP.almacenarPersona(vender);
		MP.almacenarPersonaConMedio(cuentaConsumidor,consu);
		MP.almacenarPersonaConMedio(tarjetaVendedor,vender);
		
		
		
//		Transaccion compra=new Compra(200.0, tarjateC, 1234, nueva.getIdentificar());
		Transaccion venta=vender.generarQR(1,50.0, tarjetaVendedor, consu.getIdentificar());
		
		MP.almacenarTransaccion(venta);
//		MP.realizarPago(venta.getCodigo(),tarjetaConsumidor,consu.getIdentificar());
		MP.realizarPago(venta.getCodigo(),cuentaConsumidor);
		
		Double saldoVendedor=tarjetaVendedor.getSaldo();
		Double saldoVendedorEsperado=50.0;
		Compra buscada=MP.buscarCompra(1);
		//3
		assertEquals(saldoVendedorEsperado, saldoVendedor);
		assertTrue(buscada.isPagada());
	}
	
//	@Test(expected = SaldoInsuficineteException.class)
//	public void queSeLanceUnaExcepcionSiElSaldoDeLaCuentaVirtualEsInsuficienteParaHacerUnaCompra() {
//		//1
//		
//		Billetera MP=new Billetera();
//		String nombre="diego";
//		//2
//		MedioDePago cuentaConsumidor=new CuentaVirtual(12345);
////		cuentaConsumidor.depositar(200.0);
//		MedioDePago tarjetaVendedor=new TarjetaDeDebito(12346);
//		
//		PersonaJuridica vender=new PersonaJuridica(nombre, 123, 1235);
//		Persona consu=new PersonaFisica(nombre, 123, 1234);
//		MP.almacenarPersona(consu);
//		MP.almacenarPersona(vender);
//		MP.almacenarPersonaConMedio(cuentaConsumidor,consu);
//		MP.almacenarPersonaConMedio(tarjetaVendedor,vender);
//		
//		
//		
////		Transaccion compra=new Compra(200.0, tarjateC, 1234, nueva.getIdentificar());
//		Transaccion venta=vender.generarQR(1,50.0, tarjetaVendedor, consu.getIdentificar());
//		
//		MP.almacenarTransaccion(venta);
////		MP.realizarPago(venta.getCodigo(),tarjetaConsumidor,consu.getIdentificar());
//		MP.realizarPago(venta.getCodigo(),cuentaConsumidor);
//	}
	
	

}
