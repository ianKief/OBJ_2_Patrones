package ej14.armadoPC;

import java.time.LocalDate;

public class Presupuesto {
	private String cliente;
	private LocalDate fecha;
	private Equipo equipo;
	
	public Presupuesto(String cli, LocalDate fecha, Equipo e) {
		this.cliente = cli;
		this.fecha = fecha;
		this.equipo = e;
	}
	
	public double getPrecioFinal() {
		return this.equipo.getPrecioBase() * 1.21;
	}
}
