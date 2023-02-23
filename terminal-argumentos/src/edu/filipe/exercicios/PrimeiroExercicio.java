package edu.filipe.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class PrimeiroExercicio {

    public static void MostrarNomes(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        int idade;

        while(true){
            System.out.print("Nome: ");
            nome = scanner.next();

            if(nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.println("Nome inserido: " + nome);
            System.out.println("Idade inserida: " + idade);
        }
    }

}
