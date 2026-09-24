package br.com.escola.models;

public class RecursoEducacional {

    private String patrimonio;
    private String descricao;
    private String categoria;
    private int quantidade;
    private Espaco espaco;

    public RecursoEducacional(String patrimonio, String descricao,
                              String categoria, int quantidade, Espaco espaco) {
        this.patrimonio = patrimonio;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.espaco = espaco;
    }

    public String getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Espaco getEspaco() {
        return espaco;
    }
    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    @Override
    public String toString() {
        return patrimonio + " - " + descricao;
    }
}