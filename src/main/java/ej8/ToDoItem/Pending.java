package ej8.ToDoItem;

import java.time.*;

public class Pending extends State{

	@Override
	public void iniciar(ToDoItem tarea) {
		tarea.setStartTime(LocalDateTime.now());
		tarea.setState(new InProgress());
	}

	@Override
	public void pausar(ToDoItem tarea) {
		throw new RuntimeException("No puede realizarse esa accion en este estado");
	}

	@Override
	public void finalizar(ToDoItem tarea) {
		
	}

	@Override
	public Duration workedTime(ToDoItem tarea) {
		throw new RuntimeException("La tarea no se ha iniciado");
	}

	
}
