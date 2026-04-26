package ej2.calculoSueldos;

public abstract class Empleado {
	protected static final int sueldo_basico = 20000;
	protected static final int adicional_casado = 5000;
	protected static final int adicional_por_hijo = 2000;
	protected static final int adicional_por_hora = 300;
	protected static final int adicional_por_examen = 2000;
	protected static final int adicional_por_anio_antig = 2000;
	protected static final double dto_basico = 0.13;
	protected static final double dto_adicional= 0.05;
	
	public double sueldo() {
		return this.basico()
				+ this.adicional()
				- this.descuento();
	}
	
	protected double basico() {
		return this.sueldo_basico;
	};
	
	protected abstract double adicional();
	
	protected double descuento() {
		return this.basico() * this.dto_basico
				+ this.adicional() * this.dto_adicional;
	}
}
