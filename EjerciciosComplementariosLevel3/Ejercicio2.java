package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> out = palabras.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(palabras);
        System.out.println(out);
    }
}