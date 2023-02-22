public class MinhaClasse {
    public static void main(String[] args) throws Exception {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " ano(s)");
        System.out.println("e meço " + altura + "m.");

    }
}
