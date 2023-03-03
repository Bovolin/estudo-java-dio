package edu.filipe.lists;

import java.util.*;

public class ListaOrdenada {
    
    public static void main(String[] args){

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        //Ordem de Inserção
        System.out.println("-- Ordem de Inserção --");
        System.out.println(gatos);
        System.out.println("");

        //Ordem Aleatória
        System.out.println("-- Ordem Aleatória --");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("");

        //Ordem Nome
        System.out.println("-- Ordem por Nome --");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("");

        //Ordem Idade
        System.out.println("-- Ordem por Idade --");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println("");

        //Ordem Cor
        System.out.println("-- Ordem por Cor --");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);
        System.out.println("");

    }

}

class Gato implements Comparable<Gato>{

    private String nome;
    private int idade;
    private String cor;
    
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) { return Integer.compare(g1.getIdade(), g2.getIdade()); }

}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) { return g1.getCor().compareToIgnoreCase(g2.getCor()); }

}