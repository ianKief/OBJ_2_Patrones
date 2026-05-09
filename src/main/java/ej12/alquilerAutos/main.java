package ej12.alquilerAutos;
import java.time.*;

public class main {

	public static void main(String[] args) {
		AutoEnAlquiler auto = new AutoEnAlquiler(1000, 0, "Fiat", new Flexible());
		Reserva r = new Reserva(10, LocalDate.of(2026,05,15));
		r.setAuto(auto);
		
		System.out.println("---Reembolso con politica flexible---");
		System.out.println(r.montoReembolso());
		
		auto.setPolitica(new Moderada());
		System.out.println("---Reembolso con politica moderada---");
		System.out.println(r.montoReembolso());
	}
}
