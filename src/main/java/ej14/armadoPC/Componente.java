package ej14.armadoPC;

public class Componente {
	private String nombre;
	private String descripcion;
	private double precio;
	private double consumo;
	
	public Componente(String nombre, String descripcion, double precio, double consumo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.consumo = consumo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected double getPrecio() {
		return precio;
	}

	protected double getConsumo() {
		return consumo;
	}
	
	
}
