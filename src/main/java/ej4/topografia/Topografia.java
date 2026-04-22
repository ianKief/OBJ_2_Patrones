package ej4.topografia;

public abstract class Topografia {

	public abstract double proporcionAgua();
	
	public double proporcionTierra() {
		return 1.0 - this.proporcionAgua();
	}
	
	public abstract boolean equals(Object obj);
	
}
