package edu.filipe.pilhas;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    //empilhar
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }

    //desempilhar
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
    }

    //apenas olhar o topo
    public No top(){
        return refNoEntradaPilha;
    }

    //ver se está vazio
    public boolean isEmpty(){
        if(refNoEntradaPilha == null) return true;
        return false;
    }

    @Override
    public String toString(){
        String stringRetorno = "----------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "----------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            }
            else{
                break;
            }
        }

        stringRetorno += "----------------\n";
        return stringRetorno;
    }

}
