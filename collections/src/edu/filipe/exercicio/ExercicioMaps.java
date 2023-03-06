package edu.filipe.exercicio;
import java.util.*;

public class ExercicioMaps {
    
    public static void main(String[] args){

        Map<String, Integer> populacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(populacao.toString());

        //Altere o valor de RN para 3.534.165
        populacao.put("RN", 3534165);
        System.out.println("\n" + populacao.toString());

        //Verifique se há PB e se não tiver adicione com o valor 4.039.277
        if(!populacao.containsKey("PB")) populacao.put("PB", 4039277);
        System.out.println("\n" + populacao.toString());

        //Mostre quantas pessoas há em PE
        System.out.println("\n" + populacao.get("PE"));

        //Exiba todos os estados e suas populações na ordem que foi informado
        Map<String, Integer> populacao1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("\n" + populacao1.toString());

        //Exiba os estados e suas populações em ordem alfabética
        Map<String, Integer> populacao2 = new TreeMap<>(populacao1);
        System.out.println("\n" + populacao2.toString());

        //Exiba o estado com o maior população e sua quantidade
        Collection<Integer> pessoas = populacao.values();
        Integer maior = Collections.max(pessoas);
        String maiorPopulacao = "";
        Set<Map.Entry<String, Integer>> entries = populacao.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(maior)){
                maiorPopulacao = entry.getKey();
                System.out.println("\n" + maiorPopulacao + " - " + maior);
            }
        }

        //Exiba o estado com o menor população e sua quantidade
        Integer menor = Collections.min(pessoas);
        String menorPopulacao = "";
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(menor)){
                menorPopulacao = entry.getKey();
                System.out.println("\n" + menorPopulacao + " - " + menor);
            }
        }

        //Exiba a soma da população desses estados
        Iterator<Integer> iterator = populacao.values().iterator();
        int soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\n" + soma);

        //Exiba a média da população
        Double media = (double) soma / populacao.size();
        System.out.println("\n" + media);

        //Apague o dicionário de estados
        populacao.clear();

        //Confira se está vazio
        System.out.println("\n" + populacao.isEmpty());

    }

}
