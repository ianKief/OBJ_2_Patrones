package ej14.armadoPC;

public class BuilderBasico extends EquipoBuilder{

	public BuilderBasico(Catalogo c) {
		super(c);
	}

	@Override
	public void buildProcesador() {
		this.getEquipo().agregar(this.catalogo.getComponente("Procesador basico"));
	}


	@Override
	public void buildRAM() {
		this.getEquipo().agregar(this.catalogo.getComponente("8GB"));
	}
	
	@Override
	public void buildDisco() {
		this.getEquipo().agregar(this.catalogo.getComponente("HDD 500GB"));
	}

	@Override
	public void buildTarjetaGrafica() {
		this.getEquipo().agregar(this.catalogo.getComponente("Integrada"));
	}

	@Override
	public void buildGabinete() {
		this.getEquipo().agregar(this.catalogo.getComponente("Gabinete estandar"));
	}

}
