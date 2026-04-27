package ej9.decodificadorPeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements Strategy{

	@Override
	public List<Pelicula> obtenerSugerencias(List<Pelicula> noVistas, List<Pelicula> vistas) {
		return vistas.stream()
				.flatMap(p -> p.getPeliculasSimilares().stream())
				.distinct()
				.filter(noVistas::contains)
				.sorted(Comparator.comparingInt(Pelicula::getAnioEstreno).reversed())
				.limit(3)
				.collect(Collectors.toList());
	}

}
