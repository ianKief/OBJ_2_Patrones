package ej4.topografia;

public class Agua extends Topografia{

	@Override
	public double proporcionAgua() {
		return 1.0;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null 
				&& obj.getClass() == this.getClass();
	}
}
