package ej12.alquilerAutos;

import java.time.LocalDate;

public interface PoliticaDeCancelacion {

	public double calcularReembolso(double monto, LocalDate fecha);
}
