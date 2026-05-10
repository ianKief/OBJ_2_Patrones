package ej16.excursion;

import java.util.stream.Collectors;

public class Provisoria implements EstadoExcursion {
    @Override
    public void inscribir(Excursion e, Usuario u) {
        e.getInscriptos().add(u);
        // Si al agregar este usuario se llega al mínimo, cambiamos de estado
        if (e.getInscriptos().size() == e.getCupoMin()) {
            e.setEstado(new Lista());
        }
    }

    @Override
    public String obtenerInformacion(Excursion e) {
        int faltantes = e.getCupoMin() - e.getInscriptos().size();
        return e.informar() + " - Faltan para cupo mínimo: " + faltantes;
    }
}
