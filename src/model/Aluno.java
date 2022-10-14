package model;

public class Aluno extends Pessoa{
    private String NotaCurso; 

    public Aluno(String nome, String telefone, String dataNascimento, String notaCurso) {
        super(nome, telefone, dataNascimento);
        this.NotaCurso = notaCurso;
    }

    public String getNotaCurso() {
        return NotaCurso;
    }

    public void setNotaCurso(String notaCurso) {
        NotaCurso = notaCurso;
    }

    
}
