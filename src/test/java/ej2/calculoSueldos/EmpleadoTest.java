package ar.edu.unlp.objetos.dos.CalculoSueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class EmpleadoTest {
	EmpTemporal temp1, temp2;
	EmpPasante pas1, pas2;
	EmpPlanta pl1, pl2;
	
	@BeforeEach
	void setUp() {
		temp1 = new EmpTemporal(1, 0, true);
		temp2 = new EmpTemporal(10, 2, false);
	}
}
