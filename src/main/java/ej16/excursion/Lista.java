package ej16.excursion;

import java.util.stream.Collectors;

public class Lista implements EstadoExcursion {
    @Override
    public void inscribir(Excursion e, Usuario u) {
        e.getInscriptos().add(u);
        // Si al agregar este usuario se llega al máximo, cambiamos a Llena
        if (e.getInscriptos().size() == e.getCupoMax()) {
            e.setEstado(new Llena());
        }
    }

    @Override
    public String obtenerInformacion(Excursion e) {
        int faltantes = e.getCupoMax() - e.getInscriptos().size();
        String emails = e.getInscriptos().stream()
                         .map(Usuario::getEmail)
                         .collect(Collectors.joining(", "));
                         
        return e.informar() + " - Emails inscriptos: [" + emails + "] - Faltan para cupo máximo: " + faltantes;
    }
}
