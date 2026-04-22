package ar.edu.unlp.objetos.dos.CalculoSueldos;

public class EmpPlanta extends Empleado{
	private int cantHijos;
	private boolean estaCasado;
	private int aniosAntiguedad;
	
	private static final int sueldo_basico = 50000;
	
	public EmpPlanta(int cantHijos, boolean estaCasado, int aniosAntiguedad) {
		super();
		this.cantHijos = cantHijos;
		this.estaCasado = estaCasado;
		this.aniosAntiguedad = aniosAntiguedad;
	}

	@Override
	protected double basico() {
		return this.sueldo_basico;
	}

	@Override
	protected double adicional() {
		double ad = 0;
		if(this.estaCasado) {
			ad += this.adicional_casado;
		}
		return ad + this.cantHijos * this.adicional_por_hijo
				+ this.aniosAntiguedad * this.adicional_por_anio_antig;
	}
	
	
}
