package model;

import util.Contador;

public class Aluno extends Pessoa{
    protected String NotaCurso;
    public Aluno(String nome, String telefone, String dataNascimento, String notaCurso) {
        super(nome, telefone, dataNascimento);
        this.NotaCurso = notaCurso;
        Contador.ProximoId();
    }

    public String getNotaCurso() {
        return NotaCurso;
    }

    public void setNotaCurso(String notaCurso) {
        this.NotaCurso = notaCurso;
    }

    
    
    @Override
    public String toString() {
        return "Nome:  " + nome + ", id: " + this.getId() + ", data de nascimento: " + DataNascimento + ", telefone: " + telefone + ", Nota no curso: " + NotaCurso + ", Data do cadastro: " + getDataCadastro();
    }

    
}
