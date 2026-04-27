package ej9.decodificadorPeliculas;

import java.util.*;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private List<Pelicula> peliculasSimilares;
	private double puntaje;
	
	public Pelicula(String titulo, int anioEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<Pelicula>();
	}
	
	public void agregarSimilar(Pelicula p) {
		if (!this.peliculasSimilares.contains(p)) {
			this.peliculasSimilares.add(p);
			p.agregarSimilar(this);
		}
	}

	protected String getTitulo() {
		return this.titulo;
	}

	protected int getAnioEstreno() {
		return this.anioEstreno;
	}

	protected List<Pelicula> getPeliculasSimilares() {
		return this.peliculasSimilares;
	}

	protected double getPuntaje() {
		return this.puntaje;
	}
	
	
}
