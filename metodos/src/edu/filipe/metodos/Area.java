package edu.filipe.metodos;

public class Area {
    
    public static double calcularArea(double valorUnico){
        
        double area = valorUnico * valorUnico;
        return area;
        
    }

    public static double calcularArea(double primeiroValor, double segundoValor){

        double area = primeiroValor * segundoValor;
        return area;

    }

    public static double calcularArea(double baseMaior, double baseMenor, double altura){

        double area = ((baseMaior + baseMenor) * altura) / 2;
        return area;

    }

}
