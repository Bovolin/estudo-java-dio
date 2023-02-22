public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Variaveis
        int idade = 10;
        String nome = "Filipe";

        //Constante = final
        final double VALOR_DE_PI = 3.14;

        //ternario
        String resultado;
        if(idade == VALOR_DE_PI) resultado = "verdadeiro";
        else resultado = "falso";
        //ou
        String resultado2 = idade == VALOR_DE_PI ? "verdadeiro" : "falso";
        
        System.out.println(resultado2);
        System.out.println(resultado);
    }
}
