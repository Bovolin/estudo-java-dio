import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {

        /*String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);*/

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " ano(s)");
        System.out.println("e meço " + altura + "m.");

    }
}
