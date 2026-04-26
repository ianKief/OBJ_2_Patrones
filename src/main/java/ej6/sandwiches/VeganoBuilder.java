package ej6.sandwiches;

public class VeganoBuilder extends SandwichBuilder{

	@Override
	public void buildPan() {
		this.sandwich.agregarComponente("Pan integral", 100);
	}

	@Override
	public void buildAderezo() {
		this.sandwich.agregarComponente("Salsa criolla", 20);
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarComponente("Milanesa de girgolas", 500);
	}

	@Override
	public void buildAdicional() {	}

}
