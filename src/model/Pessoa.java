package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import util.Contador;

public class Pessoa {
    protected String nome;
    protected String telefone;
    protected String DataNascimento;
    protected LocalDate DataCadastro;
    protected LocalDateTime DataUltMod;
    private Integer id;
    
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
    public LocalDate getDataCadastro() {
        return DataCadastro;
    }
    public LocalDate setDataCadastro() {
        return DataCadastro = LocalDate.now();
    }
    public LocalDateTime getDataUltMod() {
        return DataUltMod;
    }
    public LocalDateTime setDataUltMod() {
        return DataUltMod = LocalDateTime.now();
    }
    public Pessoa(String nome, String telefone, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.DataNascimento = dataNascimento;
        this.DataCadastro = setDataCadastro();
        this.id = Contador.ProximoId();
        this.DataUltMod = setDataUltMod();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return nome + ", id: " + this.getId() + ", telefone: " + telefone + ", Data de nascimento: " + DataNascimento
                + ", Data do Cadastro: " + getDataCadastro() + ", Data da última alteração: " + getDataUltMod();
    }    
}
