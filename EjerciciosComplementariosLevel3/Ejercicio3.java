package com.company;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int count = 0;
        for (String s: palabras) {
            if(s.contains("B") || s.contains("b")) {
                count++;
            }
        }

        System.out.println(palabras);
        System.out.println(count);
    }
}
