package com.company;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> out = new ArrayList<Integer>();
        for (Integer i: palabras) {
            var o = factorial(i);
            if(!out.contains(o)){
                out.add(o);
            }
        }
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
