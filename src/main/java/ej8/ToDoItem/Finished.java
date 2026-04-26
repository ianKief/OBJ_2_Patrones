package ej8.ToDoItem;

import java.time.Duration;

public class Finished extends State{

	@Override
	public void iniciar(ToDoItem tarea) {
		
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
		return Duration.between(tarea.getStartTime(), tarea.getEndTime());
	}

}
