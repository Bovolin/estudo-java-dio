package edu.filipe.maps;
import java.util.*;

public class MapOrdenado {
    
    public static void main(String[] args){

        Map<String, Livro> livros = new HashMap<>(){{
            put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
            put("Charles Duhigg", new Livro("O Poder do Hábito", 408));
            put("Yuval Noah Harari", new Livro("21 Lições para o Século 21", 432));
        }};

        System.out.println("-- Ordem Aleatória --");
        for(Map.Entry<String, Livro> livro : livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n-- Ordem de Inserção --");
        Map<String, Livro> livrosInsercao = new LinkedHashMap<>(){{
            put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
            put("Charles Duhigg", new Livro("O Poder do Hábito", 408));
            put("Yuval Noah Harari", new Livro("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : livrosInsercao.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n-- Ordem Alfabética dos Autores --");
        Map<String,Livro> livrosAlfabeticoAutores = new TreeMap<>(livrosInsercao);
        for(Map.Entry<String, Livro> livro : livrosAlfabeticoAutores.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n-- Ordem Alfabética dos Livros --");
        Set<Map.Entry<String, Livro>> livrosAlfabeticoLivros = new TreeSet<>(new ComparatorNome());
        livrosAlfabeticoLivros.addAll(livros.entrySet());
        for(Map.Entry<String, Livro> livro : livrosAlfabeticoLivros){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

    }

}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
    
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
