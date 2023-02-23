package edu.filipe.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {
    
    public static void InverterOrdem(){

        int[] numbers = {0, -5, 15, 50, 8, 4};

        for(int i = (numbers.length - 1); i >= 0; i--){
            System.out.println(numbers[i]);
        }

    }

}
