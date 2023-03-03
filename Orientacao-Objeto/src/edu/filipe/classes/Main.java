package edu.filipe.classes;

public class Main {
    
    public static void main(String[] args){

        Carro carro = new Carro();

        carro.setCor("Vermelho");
        carro.setModelo("Kwid");
        carro.setTanque(20);

        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Tanque: " + carro.getTanque());

        System.out.println("Preço pra encher tanque: R$" + carro.valorTanque(20));

    }

}
