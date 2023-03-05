package edu.filipe.exercicio;
import java.util.*;
public class ExercicioCollections {
    
    public static void main(String[] args){
        
        //Set
        Set<LinguagemFavorita> linguagemFavorita = new HashSet<>(){{
            add(new LinguagemFavorita("PHP", 1994, "VS Code"));
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("Cobol", 1959, "OpenCOBOL"));
        }};
        
        //Ordem normal
        System.out.println("-- Ordem de Inserção --");
        for(LinguagemFavorita lf : linguagemFavorita){
            System.out.println(lf.getNome() + " - " + lf.getAnoDeCriacao() + " - " + lf.getIde());
        }

        //Ordem alfabética
        System.out.println("\n-- Ordem Alfabética --");
        Set<LinguagemFavorita> treeFavoritasAlf = new TreeSet<>(new ComparatorNome());
        treeFavoritasAlf.addAll(linguagemFavorita);
        for(LinguagemFavorita lf : treeFavoritasAlf){
            System.out.println(lf.getNome() + " - " + lf.getAnoDeCriacao() + " - " + lf.getIde());
        }

        //Ordem IDE
        System.out.println("\n-- Ordem IDE --");
        Set<LinguagemFavorita> treeFavoritasIde = new TreeSet<>(new ComparatorIde());
        treeFavoritasIde.addAll(linguagemFavorita);
        for(LinguagemFavorita lf : treeFavoritasIde){
            System.out.println(lf.getNome() + " - " + lf.getAnoDeCriacao() + " - " + lf.getIde());
        }

        //Ordem ano de criação e nome
        System.out.println("\n-- Ordem Ano de Criação e Nome --");
        Set<LinguagemFavorita> treeFavoritasAcNm = new TreeSet<>(new ComparatorAcNm());
        treeFavoritasAcNm.addAll(linguagemFavorita);
        for(LinguagemFavorita lf : treeFavoritasAcNm){
            System.out.println(lf.getNome() + " - " + lf.getAnoDeCriacao() + " - " + lf.getIde());
        }

        //Ordem nome, ano de criação e ide
        System.out.println("\n-- Ordem Nome, Ano de Criação e IDE --");
        Set<LinguagemFavorita> treeFavoritasAll = new TreeSet<>(new ComparatorAll());
        treeFavoritasAll.addAll(linguagemFavorita);
        for(LinguagemFavorita lf : treeFavoritasAll){
            System.out.println(lf.getNome() + " - " + lf.getAnoDeCriacao() + " - " + lf.getIde());
        }
    }

}

class LinguagemFavorita {
    
    //Atributos
    private String nome;
    private Integer anoDeCriacao;
    private String ide;
    
    //Construtor
    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    //ToString
    @Override
    public String toString() {
        return "LinguagemFavorita [nome=" + nome + 
        ", anoDeCriacao=" + anoDeCriacao + 
        ", ide=" + ide + "]";
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao == null) {
            if (other.anoDeCriacao != null)
                return false;
        } else if (!anoDeCriacao.equals(other.anoDeCriacao))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;  
    }

}

//Comparator por nome
class ComparatorNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

//Comparator por IDE
class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}

//Comparator por Ano de Criação e Nome
class ComparatorAcNm implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class ComparatorAll implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        int ide = lf1.getIde().compareToIgnoreCase(lf2.getIde());

        if(nome != 0) return nome;
        else if(anoDeCriacao != 0) return anoDeCriacao;

        return ide;
    }
}