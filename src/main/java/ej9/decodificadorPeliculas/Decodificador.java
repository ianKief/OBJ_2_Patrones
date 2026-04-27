package ej9.decodificadorPeliculas;

import java.util.*;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> grillaPeliculas;
	private List<Pelicula> reproducidas;
	private Strategy estrategia;
	
	public Decodificador(List<Pelicula> grilla) {
		this.grillaPeliculas = new ArrayList<Pelicula>();
		this.grillaPeliculas = grilla;
		this.reproducidas = new ArrayList<Pelicula>();
	}
	
	public void setEstrategia(Strategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public void reproducir(Pelicula p) {
		if(!this.reproducidas.contains(p)) {
			this.reproducidas.add(p);
		}
	}
	
	public List<Pelicula> obtenerSugerencias(){
		List<Pelicula> sugerencias = this.grillaPeliculas.stream()
				.filter(p -> !this.reproducidas.contains(p)).collect(Collectors.toList());
		return this.estrategia.obtenerSugerencias(sugerencias, this.reproducidas);
	}
}
