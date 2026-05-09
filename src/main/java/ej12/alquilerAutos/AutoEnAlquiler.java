package ej12.alquilerAutos;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantPlazas;
	private String marca;
	private PoliticaDeCancelacion politica;
	
	public AutoEnAlquiler(double precio, int plazas, String marca, PoliticaDeCancelacion politica) {
		this.precioPorDia = precio;
		this.cantPlazas = plazas;
		this.marca = marca;
		this.politica = politica;
	}
	
	public double getPrecioDiario() {
		return this.precioPorDia;
	}
	
	public void setPolitica(PoliticaDeCancelacion p) {
		this.politica = p;
	}
	
	public double calcularReembolso(Reserva r) {
		return this.politica.calcularReembolso(r.montoAPagar(), r.getFecha());
	}
}
