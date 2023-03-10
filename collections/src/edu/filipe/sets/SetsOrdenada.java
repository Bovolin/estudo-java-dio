package edu.filipe.sets;
import java.util.*;

public class SetsOrdenada {
    
    public static void main(String[] args){

        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("70s", "comédia", 60));
        }};

        for(Serie serie : series){
            System.out.println(serie.getNome() + " - " + 
            serie.getGenero() + " - " + 
            serie.getTempoEpisodio());
        }

    }

}

class Serie{

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie [nome=" + nome + 
                ", genero=" + genero + 
                ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Serie other = (Serie) obj;
        if (nome == null)
            if (other.nome != null) return false;
        else if (!nome.equals(other.nome)) return false;
        if (genero == null)
            if (other.genero != null) return false;
        else if (!genero.equals(other.genero)) return false;
        if (tempoEpisodio == null)
            if (other.tempoEpisodio != null) return false;
        else if (!tempoEpisodio.equals(other.tempoEpisodio)) return false;
        return true;
    }

}
