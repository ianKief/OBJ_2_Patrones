package ej12.alquilerAutos;

import java.time.LocalDate;

public class Estricta implements PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(double monto, LocalDate fecha) {
		return 0;
	}

}
