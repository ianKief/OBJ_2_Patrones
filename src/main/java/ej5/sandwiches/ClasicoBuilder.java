package ej5.sandwiches;

public class ClasicoBuilder extends SandwichBuilder{

	@Override
	public void buildPan() {
		this.sandwich.agregarComponente("Pan Brioche", 100);
	}

	@Override
	public void buildAderezo() {
		this.sandwich.agregarComponente("Mayonesa", 20);
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.agregarComponente("Carne de ternera",300);
	}

	@Override
	public void buildAdicional() {
		this.sandwich.agregarComponente("Tomate", 80);
	}

}
