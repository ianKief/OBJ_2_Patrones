package ej14.armadoPC;

import java.util.*;

public class Catalogo {
	private List<Componente> componentes;
	
	public Catalogo() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public Componente getComponente(String desc) {
		return this.componentes.stream().filter(c -> c.getDescripcion().equals(desc))
				.findFirst().orElse(null);
	}
}
