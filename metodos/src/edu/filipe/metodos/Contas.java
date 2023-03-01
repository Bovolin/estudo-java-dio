package edu.filipe.metodos;

public class Contas {
    
    public static double somar(double primeiroValor, double segundoValor){
        double soma = primeiroValor + segundoValor;
        return soma;
    }

    public static double subtrair(double primeiroValor, double segundoValor){
        double subtracao = primeiroValor - segundoValor;
        return subtracao;
    }

    public static double multiplicar(double primeiroValor, double segundoValor){
        double multiplicacao = primeiroValor * segundoValor;
        return multiplicacao;
    }

    public static double dividir(double primeiroValor, double segundoValor){
        if(segundoValor == 0) throw new IllegalArgumentException("Impossível dividir por 0");
        double divisao = primeiroValor / segundoValor;
        return divisao;
    }

}
