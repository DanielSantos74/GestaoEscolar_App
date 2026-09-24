package br.com.escola.models;

import java.time.LocalDate;

public class Aluno {

    public int id;
    public String nome;
    public String matricula;
    public String email;
    public LocalDate dataNascimento;

    public Aluno(int id, String nome, String matricula, String email, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
}