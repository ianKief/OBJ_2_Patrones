package ej14.armadoPC;

public class BuilderIntermedio extends EquipoBuilder {
	
	public BuilderIntermedio(Catalogo c) {
		super(c);
	}

	@Override
	public void buildProcesador() {
		this.getEquipo().agregar(this.catalogo.getComponente("Procesador intermedio"));
	}


	@Override
	public void buildRAM() {
		this.getEquipo().agregar(this.catalogo.getComponente("16GB"));
	}
	
	@Override
	public void buildDisco() {
		this.getEquipo().agregar(this.catalogo.getComponente("SSD 500GB"));
	}

	@Override
	public void buildTarjetaGrafica() {
		this.getEquipo().agregar(this.catalogo.getComponente("GTX 1650"));
	}

	@Override
	public void buildGabinete() {
		this.getEquipo().agregar(this.catalogo.getComponente("Gabinete intermedio"));
		this.getEquipo().agregar(this.catalogo.getComponente("Fuente 800w"));
	}
}
