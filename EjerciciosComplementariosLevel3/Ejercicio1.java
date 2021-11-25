package com.company;

import java.util.*;

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

        palabras.removeAll(Collections.singleton(null));
        palabras.removeAll(Collections.singleton(""));

        System.out.println(palabras);
    }
}
