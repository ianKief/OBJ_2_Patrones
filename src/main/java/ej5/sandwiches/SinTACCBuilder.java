package ej5.sandwiches;

public class SinTACCBuilder extends SandwichBuilder{

	@Override
	public void buildPan() {
		this.sandwich.agregarComponente("Pan de chipa", 150);
	}

	@Override
	public void buildAderezo() {
		this.sandwich.agregarComponente("Salsa tartara", 18);
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarComponente("Carne de pollo", 250);
	}

	@Override
	public void buildAdicional() {
		this.sandwich.agregarComponente("Verduras grilladas", 200);
	}

}
