package ej6.sandwiches;

import java.util.*;

public class Sandwich {
	private List<Componente> componentes;
	
	public Sandwich() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public void agregarComponente(String nombre, double precio) {
		this.componentes.add(new Componente(nombre,precio));
	}
	
	public double calcularPrecio() {
		return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
	}
}