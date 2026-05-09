package ej12.alquilerAutos;

import java.time.LocalDate;

public class Flexible implements PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(double monto, LocalDate fecha) {
		return monto;
	}

}
