package ej14.armadoPC;

import java.util.*;

public class Equipo {
	private List<Componente> componentes;
	
	public Equipo() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public void agregar(Componente c) {
		this.componentes.add(c);
	}
	
	public double getPrecioBase() {
		return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
	}
	
	public double getConsumo() {
		return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
	}
}
