package ej9.decodificadorPeliculas;

import java.util.*;
public interface Strategy {
	
	List<Pelicula> obtenerSugerencias(List<Pelicula> noVistas, List<Pelicula> vistas);
}
