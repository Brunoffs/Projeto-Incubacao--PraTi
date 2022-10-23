package model;

import util.Contador;

public class Aluno extends Pessoa{
    protected String notaCurso;
    public Aluno(String nome, String telefone, String dataNascimento, String notaCurso) {
        super(nome, telefone, dataNascimento);
        this.notaCurso = notaCurso;
        Contador.ProximoId();
    }

    public String getNotaCurso() {
        return notaCurso;
    }

    public void setNotaCurso(String notaCurso) {
        this.notaCurso = notaCurso;
    }

    
    
    @Override
    public String toString() {
        return "Nome:  " + nome + ", id: " + this.getId() + ", data de nascimento: " + dataNascimento + ", telefone: " + telefone + 
        ", Nota no curso: " + notaCurso + ", Data do cadastro: " + getDataCadastro() + ", Data da última modificação: " + getDataUltimaModificacao();
    }

    
}
