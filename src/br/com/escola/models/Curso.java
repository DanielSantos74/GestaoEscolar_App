package br.com.escola.models;

public class Curso {

    public int id;
    public String codigo;
    public String nome;
    public int cargaHorariaTotal;

    public Curso(int id, String codigo, String nome, int cargaHorariaTotal) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
    }
}