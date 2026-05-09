package ej12.alquilerAutos;

import java.time.*;

public class Reserva {
	private int cantDias;
	private LocalDate fecha;
	private AutoEnAlquiler auto;
	
	public Reserva (int cantDias, LocalDate fecha) {
		this.cantDias = cantDias;
		this.fecha = fecha;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setAuto(AutoEnAlquiler auto) {
		this.auto = auto;
	}
	
	public double montoAPagar() {
		return this.cantDias * this.auto.getPrecioDiario();
	}
	
	public double montoReembolso() {
		return auto.calcularReembolso(this);
	}
}
