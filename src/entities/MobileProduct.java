package entities;
public class MobileProduct extends Product {

    private String franquiaDados;

    public MobileProduct(String nome, double mensalidade, String franquiaDados) {
        super(nome, mensalidade, "VOZ");
        this.franquiaDados = franquiaDados;
    }

    public String getFranquiaDados() {
        return franquiaDados;
    }

    public void setFranquiaDados(String franquiaDados) {
        this.franquiaDados = franquiaDados;
    }

    @Override
    public boolean activate() {
        System.out.println("Telefone Celular ativado!");
        return false;
    }

    @Override
    public boolean suspend() {
        System.out.println("Telefone Celular suspenso!");
        return false;
    }

    @Override
    public boolean deactivate() {
        System.out.println("Telefone Celular cancelado!");
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " MobileProduct{" +
                "franquiaDados='" + franquiaDados + '\'' +
                '}';
    }
}
