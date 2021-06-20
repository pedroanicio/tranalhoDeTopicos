/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Curso {
    String nome, descricao;
    int numCursos, horasSemestrais, nivel;
    
    public Curso(String nome,String descricao, int numCursos,int horasSemestrais, int nivel){
        this.nome = nome;
        this.descricao = descricao;
        this.numCursos = numCursos;
        this.horasSemestrais = horasSemestrais;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumCursos() {
        return numCursos;
    }

    public void setNumCursos(int numCursos) {
        this.numCursos = numCursos;
    }

    public int getHorasSemestrais() {
        return horasSemestrais;
    }

    public void setHorasSemestrais(int horasSemestrais) {
        this.horasSemestrais = horasSemestrais;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
