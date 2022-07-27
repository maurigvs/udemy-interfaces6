package entities;

public class PhoneProduct extends Product {

    private int qtdeMinutos;

    public PhoneProduct(String nome, double mensalidade, int qtdeMinutos) {
        super(nome, mensalidade, "FONE");
        this.qtdeMinutos = qtdeMinutos;
    }

    public int getQtdeMinutos() {
        return qtdeMinutos;
    }

    public void setQtdeMinutos(int qtdeMinutos) {
        this.qtdeMinutos = qtdeMinutos;
    }

    @Override
    public boolean activate() {
        System.out.println("Telefone Fixo habilitado!");
        return false;
    }

    @Override
    public boolean suspend() {
        System.out.println("Telefone Fixo suspenso!");
        return false;
    }

    @Override
    public boolean deactivate() {
        System.out.println("Telefone Fixo desabilitado!");
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " PhoneProduct{" +
                "qtdeMinutos=" + qtdeMinutos +
                '}';
    }
}
