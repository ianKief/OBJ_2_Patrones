package ej8.ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State {

	@Override
	public void iniciar(ToDoItem tarea) {
		
	}

	@Override
	public void pausar(ToDoItem tarea) {
		tarea.setState(new Paused());
		
	}

	@Override
	public void finalizar(ToDoItem tarea) {
		tarea.setState(new Finished());
		tarea.setEndTime(LocalDateTime.now());
	}

	@Override
	public Duration workedTime(ToDoItem tarea) {
		return Duration.between(tarea.getStartTime(), LocalDateTime.now());
	}

}
