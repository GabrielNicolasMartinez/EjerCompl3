package com.company;

import java.time.LocalDate;

public class Alumno {
    public String nombre;
    public String apellido;
    public LocalDate fecha;

    public Alumno(String Nombre, String Apellido, LocalDate Fecha) {
        nombre = Nombre;
        apellido = Apellido;
        fecha = Fecha;
    }
}
