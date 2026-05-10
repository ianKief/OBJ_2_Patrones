package ej16.excursion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMin;
    private int cupoMax;
    
    // Asociaciones
    private List<Usuario> inscriptos;
    private List<Usuario> espera;
    private EstadoExcursion estado;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo, int cupoMin, int cupoMax) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        
        this.inscriptos = new ArrayList<>();
        this.espera = new ArrayList<>();
        this.estado = new Provisoria(); // Toda excursión nace en estado Provisoria
    }

    // --- MÉTODOS DE LA LÓGICA DE ESTADO ---
    
    public void inscribir(Usuario u) {
        // Se delega el comportamiento al estado actual
        this.estado.inscribir(this, u);
    }

    public String obtenerInformacion() {
        // Se delega el comportamiento al estado actual
        return this.estado.obtenerInformacion(this);
    }

    public String informar() {
        return "Excursión: " + nombre + " | Costo: $" + costo + 
               " | Desde: " + fechaInicio + " Hasta: " + fechaFin + 
               " | Encuentro: " + puntoEncuentro;
    }

    // --- GETTERS Y SETTERS ---

    public void setEstado(EstadoExcursion e) {
        this.estado = e;
    }

    public String getNombre() { return nombre; }
    public int getCupoMin() { return cupoMin; }
    public int getCupoMax() { return cupoMax; }
    
    // Estos getters son necesarios para que los estados puedan manipular las listas y consultar cupos
    public List<Usuario> getInscriptos() { return inscriptos; }
    public List<Usuario> getEspera() { return espera; }
}