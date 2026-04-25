package ej5.sandwiches;

public class Director {
	private SandwichBuilder builder;
	
	public void setBuilder(SandwichBuilder builder) {
		this.builder = builder;
	}
	
	public Sandwich armarSandwich() {
		builder.nuevoSandwich();
		builder.buildPan();
		builder.buildAderezo();
		builder.buildPrincipal();
		builder.buildAdicional();
		return builder.getSandwich();
	}
}
