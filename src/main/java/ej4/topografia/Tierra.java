package ej4.topografia;

public class Tierra extends Topografia{

	@Override
	public double proporcionAgua() {
		return 0.0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj != null 
				&& obj.getClass() == this.getClass();
	}
}
