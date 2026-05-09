package ej14.armadoPC;

public class BuilderGamer extends EquipoBuilder{

	public BuilderGamer(Catalogo c) {
		super(c);
	}

	@Override
	public void buildProcesador() {
		this.getEquipo().agregar(this.catalogo.getComponente("Procesador gamer"));
		this.getEquipo().agregar(this.catalogo.getComponente("Pad termico"));
		this.getEquipo().agregar(this.catalogo.getComponente("Cooler"));
	}


	@Override
	public void buildRAM() {
		this.getEquipo().agregar(this.catalogo.getComponente("32GB"));
		this.getEquipo().agregar(this.catalogo.getComponente("32GB"));
	}
	
	@Override
	public void buildDisco() {
		this.getEquipo().agregar(this.catalogo.getComponente("SSD 500GB"));
		this.getEquipo().agregar(this.catalogo.getComponente("SSD 1TB"));
	}

	@Override
	public void buildTarjetaGrafica() {
		this.getEquipo().agregar(this.catalogo.getComponente("RTX 4090"));
	}

	@Override
	public void buildGabinete() {
		this.getEquipo().agregar(this.catalogo.getComponente("Gabinete gamer"));
		double consumo = this.getEquipo().getConsumo() * 1.50;
		this.getEquipo().agregar(this.catalogo.getComponente("Fuente " + consumo + " w"));
	}
}
