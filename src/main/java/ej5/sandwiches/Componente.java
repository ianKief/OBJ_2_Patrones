package ej5.sandwiches;

public class Componente {
	private String nombre;
	private double precio;
	
	public Componente(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
