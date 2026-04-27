package ej9.decodificadorPeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Strategy{

	@Override
	public List<Pelicula> obtenerSugerencias(List<Pelicula> noVistas, List<Pelicula> vistas) {
		return noVistas.stream()
	            .sorted(Comparator.comparingInt(Pelicula::getAnioEstreno).reversed())
	            .limit(3)
	            .collect(Collectors.toList());
	}

}
