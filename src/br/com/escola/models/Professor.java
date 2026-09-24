package br.com.escola.models;

public class Professor {

    public int id;
    public String registroFundamental;
    public String nome;
    public int titulacao;

    public Professor(int id, String registroFundamental, String nome, int titulacao) {
        this.id = id;
        this.registroFundamental = registroFundamental;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public void vincularDisciplina(Disciplina disciplina) {
    }

    public String getNome() {
        return nome;
    }
}