package br.com.escola.models;

public class Disciplina {

    public int id;
    public String codigo;
    public String nome;
    public int cargaHoraria;

    public Disciplina(int id, String codigo, String nome, int cargaHoraria) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }
}