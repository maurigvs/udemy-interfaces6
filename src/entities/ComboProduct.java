package entities;

import java.util.List;

public class ComboProduct extends Product {

    private List<Product> products;

    public ComboProduct(String nome, List<Product> products) {
        super(nome);
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProducts(Product product){
        getProducts().add(product);

        if(super.getCategoria() != null){
            super.setCategoria(super.getCategoria()+"+"+product.getCategoria());
        } else {
            super.setCategoria(product.getCategoria());
        }

        super.setMensalidade(super.getMensalidade()+product.getMensalidade());
    }

    @Override
    public boolean activate() {
        for(Product product : getProducts()){
            product.activate();
        }
        return false;
    }

    @Override
    public boolean suspend() {
        for(Product product : getProducts()){
            product.suspend();
        }
        return false;
    }

    @Override
    public boolean deactivate() {
        for(Product product : getProducts()){
            product.deactivate();
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " ComboProduct{" +
                "products=" + products +
                '}';
    }
}
