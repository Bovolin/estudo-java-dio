package edu.filipe.classes;

public class Carro extends Veiculo {
    
    String cor;
    String modelo;
    int tanque;

    //Getters e Setters
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getTanque() {
        return tanque;
    }
    public void setTanque(int tanque) {
        this.tanque = tanque;
    }
    //  fim getters e setters

    //Construtor
    public Carro(){}
    public Carro(String cor, String modelo, int tanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;
    }
    //  fim construtor

    //Definir o preço do tanque
    public double valorTanque(double valorCombustivel){
        return tanque * valorCombustivel;
    }
    //  fim do método

}
