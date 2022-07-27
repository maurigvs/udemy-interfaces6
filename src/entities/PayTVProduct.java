package entities;

public class PayTVProduct extends Product {

    private int qtdeCanais;

    public PayTVProduct(String nome, double mensalidade, int qtdeCanais) {
        super(nome, mensalidade, "TV");
        this.qtdeCanais = qtdeCanais;
    }

    public int getQtdeCanais() {
        return qtdeCanais;
    }

    public void setQtdeCanais(int qtdeCanais) {
        this.qtdeCanais = qtdeCanais;
    }

    @Override
    public boolean activate() {
        System.out.println("Sinal de TV liberado!");
        return false;
    }

    @Override
    public boolean suspend() {
        System.out.println("Sinal de TV suspenso!");
        return false;
    }

    @Override
    public boolean deactivate() {
        System.out.println("Sinal de TV desativado!");
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " PayTVProduct{" +
                "qtdeCanais=" + qtdeCanais +
                '}';
    }
}
