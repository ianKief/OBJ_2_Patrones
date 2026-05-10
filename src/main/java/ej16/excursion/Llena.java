package ej16.excursion;

public class Llena implements EstadoExcursion {
    @Override
    public void inscribir(Excursion e, Usuario u) {
        // La excursión está llena, va directo a la lista de espera
        e.getEspera().add(u);
    }

    @Override
    public String obtenerInformacion(Excursion e) {
        // Si está llena, solo retorna la información básica
        return e.informar();
    }
}