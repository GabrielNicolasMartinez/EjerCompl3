package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import static java.time.temporal.ChronoUnit.SECONDS;

public class Ejercicio5 {
    public static void main(String[] args) {
        LocalDate current = LocalDate.parse("2021-12-12");
        List<Alumno> alumnos = List.of(new Alumno("Alejandro", "Solis", current.minusYears(30)),
                new Alumno("Alfredo", "Gomez", current.minusYears(25)),
                new Alumno("Angel", "Fernades", current.minusYears(20)),
                new Alumno("Ballesteros", "Franco", current.minusYears(18)),
                new Alumno("Carlos", "Kowalczuk", current.minusYears(35)));
        Map<String, Integer> out = new HashMap<>();
        alumnos.stream().forEach(i-> out.put(i.nombre + " " + i.apellido, (int) ChronoUnit.YEARS.between(i.fecha, current)));
        System.out.println(out);
    }
}
