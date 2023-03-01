package edu.filipe.metodos;

public class Relogio {
    
    public static String enviarMensagem(double horario){
        String complemento = "";

        if(horario >= 0 && horario <= 11.59) complemento = "Dia!";
        else if(horario >= 12 && horario <= 17.59) complemento = "Tarde!";
        else if(horario >= 18 && horario <= 23.59) complemento = "Noite!";
        else throw new IllegalArgumentException("O horário deve ser entre 0 e 23.59!");

        String mensagem = "Bom " + complemento;
        return mensagem;
    }

}
