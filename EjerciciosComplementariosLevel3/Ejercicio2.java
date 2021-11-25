package com.company;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> out = new ArrayList<Integer>();
        for (Integer i: palabras) {
            var o = i * i;
            if(!out.contains(o)){
                out.add(o);
            }
        }
        System.out.println(palabras);
        System.out.println(out);
    }
}