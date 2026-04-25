package ej5.sandwiches;

public class VegetarianoBuilder extends SandwichBuilder{

	@Override
	public void buildPan() {
		this.sandwich.agregarComponente("Pan con semillas", 120);
	}

	@Override
	public void buildAderezo() {	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarComponente("Provoleta grillada", 200);
	}

	@Override
	public void buildAdicional() {
		this.sandwich.agregarComponente("Berenjenas en escabeche", 100);
	}

}
