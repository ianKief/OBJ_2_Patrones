package ej2.calculoSueldos;

public class EmpPasante extends Empleado{
	private int cantExamRendidos;
	
	public EmpPasante(int exam) {
		this.cantExamRendidos = exam;
	}

	@Override
	protected double adicional() {
		return this.cantExamRendidos * this.adicional_por_examen;
	}
	
	
}
