package ej8.ToDoItem;

import java.time.*;

public abstract class State {
	
	public abstract void iniciar(ToDoItem tarea);
	public abstract void pausar(ToDoItem tarea);
	public abstract void finalizar(ToDoItem tarea);
	public abstract Duration workedTime(ToDoItem tarea);
	public void addComment(ToDoItem tarea, String comentario) {
		tarea.addComment(comentario);
	}
}
