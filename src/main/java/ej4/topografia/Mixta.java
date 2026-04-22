package ej4.topografia;

import java.util.Arrays;

public class Mixta extends Topografia{
	private Topografia[] componentes;
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.componentes = new Topografia[4];
		this.componentes[0] = t1;
		this.componentes[1] = t2;
		this.componentes[2] = t3;
		this.componentes[3] = t4;
	}

	@Override
	public double proporcionAgua() {
		double prop = 0.0;
		for (int i=0; i<4; i++) {
			prop += this.componentes[i].proporcionAgua();
		}
		return prop / 4.0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		
		Mixta otra = (Mixta) obj;
		
		return Arrays.equals(this.componentes, otra.componentes);
	}
}
