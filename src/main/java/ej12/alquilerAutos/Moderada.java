package ej12.alquilerAutos;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(double monto, LocalDate fecha) {
		long diasDeAntelacion = ChronoUnit.DAYS.between(LocalDate.now(), fecha);
		if(diasDeAntelacion >= 7) { return monto; }
		if(diasDeAntelacion >= 2) { return monto * 0.5; }
		return 0;
	}

}
