package edu.filipe.metodos;

public class Main {
    
    public static void main(String[] args){

        System.out.println("Resultado: " + Contas.somar(2, 3));
        System.out.println("Resultado: " + Contas.subtrair(4, 2));
        System.out.println("Resultado: " + Contas.multiplicar(4, 8));
        System.out.println("Resultado: " + Contas.subtrair(4, 2));

        System.out.println(Relogio.enviarMensagem(3));
        System.out.println(Relogio.enviarMensagem(13));
        System.out.println(Relogio.enviarMensagem(19));

        System.out.println("Área do quadrado: " + Area.calcularArea(5));
        System.out.println("Área do retângulo: " + Area.calcularArea(2, 3));
        System.out.println("Área do trapézio: " + Area.calcularArea(2, 2, 5));

    }

}
