/**
 * <h1>Usuário</h1>
 * <p>Classe para testar o java usando métodos</p>
 * 
 * @author Filipe Bovolin
 * @version 1.0
 * @since 22/02/2023
 */
public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada: " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("TV Ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
