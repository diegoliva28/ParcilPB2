package ar.edu.unlam.billeteraTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Billetera {
	private List<Transaccion> transacciones;//Compras y transferencias
	//linkest list
	private Set<Persona> personas;//Juridicas(VENDEDOR) y fisicas(CONSUMIDOR)
	//TreeSet
	private Map<MedioDePago,Persona> listaDeMediosDePagoPorPersona;
	//HASHMAP
	
	public Billetera() {
		this.transacciones=new LinkedList<Transaccion>();
		this.personas=new TreeSet<Persona>();
		this.listaDeMediosDePagoPorPersona=new HashMap<MedioDePago, Persona>();
	}
	
	//Transferencia en billeterta
	//Las cuentas saben depositar y extraer
	

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public Set<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	public Map<MedioDePago, Persona> getListaDeMediosDePagoPorPersona() {
		return listaDeMediosDePagoPorPersona;
	}

	public void setListaDeMediosDePagoPorPersona(Map<MedioDePago, Persona> listaDeMediosDePagoPorPersona) {
		this.listaDeMediosDePagoPorPersona = listaDeMediosDePagoPorPersona;
	}

	public void almacenarTransaccion(Transaccion nueva) {
		this.transacciones.add(nueva);
	}

	public void almacenarPersona(Persona nueva) {
		this.personas.add(nueva);
	}

	public void almacenarPersonaConMedio(MedioDePago medio, Persona nueva) {
		this.listaDeMediosDePagoPorPersona.put(medio, nueva);
	}

	public void realizarPago(Integer codigoDeCompra, MedioDePago tarjetaConsumidor) {
		Compra buscada=this.buscarCompra(codigoDeCompra);
		if(buscada!=null ) {
			Double monto=buscada.getMonto();
			Double saldo=tarjetaConsumidor.getSaldo();
			Boolean puedePagar=saldo>=buscada.getMonto();
			if(puedePagar) {
				buscada.SePago();;
				MedioDePago vendedor=buscada.getMedio();
				vendedor.depositar(monto);
			}
			
		}
		
	}

	public Compra buscarCompra(Integer codigoDeCompra) {
		for (Transaccion compra : this.transacciones) {
			if(compra instanceof Compra && compra.getCodigo().equals(codigoDeCompra)) {
				return (Compra) compra;
			}
			
		}
		return null;
	}
	

	
	
}
