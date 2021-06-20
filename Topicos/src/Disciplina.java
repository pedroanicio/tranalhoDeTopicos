/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Disciplina {
    String professor;
    int semestre, ano, numeroDisciplina;
    
    public Disciplina(String professor, int semestre, int ano, int numeroDisciplina ){
        this.professor = professor;
        this.semestre = semestre;
        this.ano = ano;
        this.numeroDisciplina = numeroDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroDisciplina() {
        return numeroDisciplina;
    }

    public void setNumeroDisciplina(int numeroDisciplina) {
        this.numeroDisciplina = numeroDisciplina;
    }
    
}
