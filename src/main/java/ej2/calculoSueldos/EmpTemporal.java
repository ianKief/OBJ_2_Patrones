package ej2.calculoSueldos;

public class EmpTemporal extends Empleado{
	private int cantHorasTrabajadas;
	private int cantHijos;
	private boolean estaCasado;
	
	public EmpTemporal(int horas, int hijos, boolean casado) {
		this.cantHorasTrabajadas = horas;
		this.cantHijos = hijos;
		this.estaCasado = casado;
	}
	
	@Override
	protected double basico() {
		return super.basico()
				+ this.adicional_por_hora * this.cantHorasTrabajadas;
	}

	@Override
	protected double adicional() {
		double ad = 0;
		if(this.estaCasado) {
			ad += this.adicional_casado;
		}
		return ad + this.cantHijos * this.adicional_por_hijo;
	}

}
