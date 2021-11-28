package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int count = (int) palabras.stream().filter(p -> p.contains("B") || p.contains("b")).count();

        System.out.println(palabras);
        System.out.println(count);
    }
}
