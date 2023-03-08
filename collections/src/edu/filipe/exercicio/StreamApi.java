package edu.filipe.exercicio;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    
    public static void main(String[] args){

        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        numeros.forEach(System.out::print);

        numeros.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("-----------------");

        numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-----------------");

        numeros.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-----------------");

        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("-----------------");

        System.out.println(numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .removeIf(i -> (i % 2 != 0)));


        
                

    }

}
