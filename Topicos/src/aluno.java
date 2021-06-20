/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class aluno {
    private String  nome, numeroMatri, cpf, endereco, telefone, turma;
    
    public aluno(String nome,String numeroMatri,String cpf,String endereco,String telefone,String turma){
        this.nome = nome;
        this.numeroMatri = numeroMatri;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatri() {
        return numeroMatri;
    }

    public void setNumeroMatri(String numeroMatri) {
        this.numeroMatri = numeroMatri;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
}
