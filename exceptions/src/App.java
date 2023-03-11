import javax.swing.*;

public class App {

    public static void main(String[] args) throws Exception {
    
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Insira um número!");
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Impossível dividir por 0!");
        }
        finally{
            System.out.println("Chegou no finally.");
        }
    }

    public static int dividir(int a, int b){ return a / b; }

}
