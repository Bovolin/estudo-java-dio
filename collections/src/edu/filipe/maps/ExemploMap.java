package edu.filipe.maps;
import java.util.*;

public class ExemploMap {
    
    public static void main(String[] args){

        //Criar map
        Map<String, Double> carros = new HashMap<>(){{

            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);

        }};

        System.out.println(carros.toString());

        //Substituir
        carros.put("Gol", 15.2);
        System.out.println(carros.toString());

        //Consultar
        System.out.println(carros.containsKey("Tucson"));
        System.out.println(carros.containsKey("Uno"));

        //Get
        System.out.println(carros.get("Uno"));

        //keySet
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        //Values
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        //Maior e menor
        Double consumoMaisEficiente = Collections.max(consumos);
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente + " " + consumoMaisEficiente);
            }
        }

        Double consumoMenosEficiente = Collections.min(consumos);
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry : carros.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        //LinkedHashMap
        Map<String, Double> carros1 = new LinkedHashMap<>(){{

            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println(carros1.toString());

        //TreeMap
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2.toString());


    }

}
