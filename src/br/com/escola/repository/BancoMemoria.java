package br.com.escola.repository;

import br.com.escola.models.Espaco;
import br.com.escola.models.RecursoEducacional;

import java.util.ArrayList;
import java.util.List;

public class BancoMemoria {

    private static List<Espaco> espacos = new ArrayList<>();
    private static List<RecursoEducacional> recursos = new ArrayList<>();

    public static void adicionarEspaco(Espaco espaco) {
        espacos.add(espaco);
    }

    public static List<Espaco> listarEspacos() {
        return espacos;
    }

    public static void adicionarRecurso(RecursoEducacional recurso) {
        recursos.add(recurso);
    }

    public static List<RecursoEducacional> listarRecursos() {
        return recursos;
    }
}