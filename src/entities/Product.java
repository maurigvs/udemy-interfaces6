package entities;

import interfaces.BasicProduct;

public abstract class Product implements BasicProduct {

    private String nome;
    private double mensalidade;

    private String categoria;

    public Product() {
    }

    public Product(String nome, double mensalidade, String categoria) {
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.categoria = categoria;
    }

    public Product(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean activate() {
        return false;
    }

    @Override
    public boolean suspend() {
        return false;
    }

    @Override
    public boolean deactivate() {
        return false;
    }

    @Override
    public boolean charge() {
        return false;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", mensalidade=" + mensalidade +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
