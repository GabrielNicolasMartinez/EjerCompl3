package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        palabras.add("");
        System.out.println(palabras);

        var r = palabras.stream().filter(i -> i != null &&  i != "").collect(Collectors.toList());

        System.out.println(r);
    }
}
