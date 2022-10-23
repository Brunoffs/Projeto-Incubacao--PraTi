package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import util.Contador;

public class Pessoa {
    protected String nome;
    protected String telefone;
    protected String dataNascimento;
    protected LocalDate dataCadastro;
    protected LocalDateTime dataUltimaModificacao;
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
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public LocalDate setDataCadastro() {
        return dataCadastro = LocalDate.now();
    }
    public LocalDateTime getDataUltimaModificacao() {
        return dataUltimaModificacao;
    }
    public LocalDateTime setDataUltimaModificacao() {
        return dataUltimaModificacao = LocalDateTime.now();
    }
    public Pessoa(String nome, String telefone, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = setDataCadastro();
        this.id = Contador.ProximoId();
        this.dataUltimaModificacao = setDataUltimaModificacao();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return nome + ", id: " + this.getId() + ", telefone: " + telefone + ", Data de nascimento: " + dataNascimento
                + ", Data do Cadastro: " + getDataCadastro() + ", Data da última alteração: " + getDataUltimaModificacao();
    }    
}
