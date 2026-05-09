package ej14.armadoPC;

public abstract class EquipoBuilder {
	private Equipo equipo;
	protected Catalogo catalogo;
	
	public EquipoBuilder(Catalogo c) {
		this.catalogo = c;
	}
	
	public void crearEquipo() {
		this.equipo = new Equipo();
	}
	
	public Equipo getEquipo() {
		return this.equipo;
	}
	
	public abstract void buildProcesador();
	public abstract void buildRAM();
	public abstract void buildDisco();
	public abstract void buildTarjetaGrafica();
	public abstract void buildGabinete();
	public void buildMonitor() {
		//Vacio para futuras configuraciones
	}
	
	public void buildPeriferico() {
		//Vacio para futuras configuraciones
	}
}
