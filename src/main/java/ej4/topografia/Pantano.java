package ej4.topografia;

public class Pantano extends Topografia{

	@Override
	public double proporcionAgua() {
		return 0.7;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null
				&& obj.getClass() == this.getClass();
	}

	
}
