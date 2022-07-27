package entities;

public class BroadBandProduct extends Product {

    private String velocidade;

    public BroadBandProduct(String nome, double mensalidade, String velocidade) {
        super(nome, mensalidade, "VTA");
        this.velocidade = velocidade;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public boolean activate() {
        System.out.println("Serviço de Internet instalado!");
        return false;
    }

    @Override
    public boolean suspend() {
        System.out.println("Serviço de Internet suspenso!");
        return false;
    }

    @Override
    public boolean deactivate() {
        System.out.println("Serviço de Internet cancelado!");
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " BroadBandProduct{" +
                "velocidade='" + velocidade + '\'' +
                '}';
    }
}
