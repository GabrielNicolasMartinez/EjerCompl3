package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> out = palabras.stream().map(Ejercicio4::factorial).distinct().collect(Collectors.toList());
        System.out.println(palabras);
        System.out.println(out);
    }

    public static int factorial(int number) {
        int ret = 1;
        for (int fac = 2; fac <= number; fac++) {
            ret *= fac;
        }
        return ret;
    }
}
