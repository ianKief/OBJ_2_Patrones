package ej8.ToDoItem;
import java.time.*;
import java.util.*;

public class ToDoItem {
	private String nombre;
	private State estado;
	private List<String> comentarios;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	public ToDoItem(String name) {
		this.nombre = name;
		this.comentarios = new ArrayList<String>();
		setState(new Pending());
	}
	
	public void setState(State estado) {
		this.estado = estado;
	}
	
	public void start() {
		this.estado.iniciar(this);
	}
	
	public void togglePause() {
		this.estado.pausar(this);
	}
	
	public void finish() {
		this.estado.finalizar(this);
	}
	
	public Duration workedTime() {
		return this.estado.workedTime(this);
	}
	
	public void addComment(String comentario) {
		this.comentarios.add(comentario);
	}

	protected LocalDateTime getStartTime() {
		return startTime;
	}

	protected void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	protected LocalDateTime getEndTime() {
		return endTime;
	}

	protected void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	protected void setEstado(State estado) {
		this.estado = estado;
	}
	
}
