package ej6.sandwiches;

public abstract class SandwichBuilder {
	protected Sandwich sandwich;
	
	public void nuevoSandwich() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	
	public abstract void buildPan();
	public abstract void buildAderezo();
	public abstract void buildPrincipal();
	public abstract void buildAdicional();
}
