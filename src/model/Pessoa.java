package model;

public  class Pessoa {
    private String nome;
    private String telefone;
    private String DataNascimento;
    private String DataCadastro;
    private String DataUltMod;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }
    public String getDataCadastro() {
        return DataCadastro;
    }
    public void setDataCadastro(String dataCadastro) {
        DataCadastro = dataCadastro;
    }
    public String getDataUltMod() {
        return DataUltMod;
    }
    public void setDataUltMod(String dataUltMod) {
        DataUltMod = dataUltMod;
    }
    public Pessoa(String nome, String telefone, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        DataNascimento = dataNascimento;
    }

    
    
}
