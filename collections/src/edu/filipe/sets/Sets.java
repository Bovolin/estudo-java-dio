package edu.filipe.sets;

import java.util.*;

public class Sets {
    
    public static void main(String[] args){

        //Iniciar set
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //Verificar
        System.out.println(notas.contains(5d));

        //Menor e maior
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        //Iterator
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //Remover
        notas.remove(0d);
        System.out.println(notas);

        //Ordem crescente
        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);

        //Apagar tudo
        notas.clear();
        System.out.println(notas);

    }

}
