/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Departamento {
    String nome, telefoneSala;
    int codigo, numeroSala;
    
    public Departamento(String nome, String telefoneSala, int codigo, int numeroSala){
        this.nome = nome;
        this.telefoneSala = telefoneSala;
        this.codigo = codigo;
        this.numeroSala = numeroSala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneSala() {
        return telefoneSala;
    }

    public void setTelefoneSala(String telefoneSala) {
        this.telefoneSala = telefoneSala;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    
}
