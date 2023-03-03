package edu.filipe.lists;

import java.util.*;

//Adicionar notas de um aluno
public class Lista {

    public static void main(String[] args){

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(4.0);
        notas.add(2.0);
        notas.add(10.0);
        notas.add(5.0);
        notas.add(8.0);
        notas.add(6.2);

        //Exibindo tudo
        System.out.println(notas.toString());

        //Exibindo por index
        System.out.println(notas.indexOf(5d));

        //Adicionando à uma posição
        notas.add(4, 8.0);

        System.out.println(notas.toString());

        //Substituir
        notas.set(5, 9.0);

        System.out.println(notas.toString());

        //Verificar se há um conteúdo específico
        System.out.println(notas.contains(2d));

        //Exibir
        System.out.println(notas.get(2));

        //Exibir menor e maior valor
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        //Exibir a soma
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //Exibir média
        System.out.println(soma / notas.size());

        //Remover
        notas.remove(0d);
        notas.remove(0);
        System.out.println(notas);

        //Remover tudo
        notas.clear();
        System.out.println(notas);

        //Verificar se há conteúdo
        System.out.println(notas.isEmpty());
    }
    
}
