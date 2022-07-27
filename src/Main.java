import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Product> products = new ArrayList<>();
    static List<Product> items = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo á Claro!");

        boolean mobile = true;
        boolean broadband = true;
        boolean paytv = true;
        boolean bundle = true;

        // PLANOS DE TV
        do {
            System.out.print("Nome do Plano de TV: ");
            String plano = sc.nextLine();

            System.out.print("Quantidade de Canais: ");
            int canais = sc.nextInt();
            sc.nextLine();

            System.out.print("Valor da mensalidade: ");
            double mensalidade = sc.nextDouble();

            products.add(new PayTVProduct(plano, mensalidade, canais));

            System.out.println();
            System.out.print("Deseja adicionar outro? (S/N): ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            if(option != 'S'){
                paytv = false;
            }
        } while(paytv);

        // PLANOS DE BANDA LARGA
        do {
            System.out.print("Nome do Plano de Banda Larga: ");
            String plano = sc.nextLine();

            System.out.print("Velocidade de Dados do plano: ");
            String velocidade = sc.nextLine();

            System.out.print("Valor da mensalidade: ");
            double mensalidade = sc.nextDouble();

            products.add(new BroadBandProduct(plano, mensalidade, velocidade));

            System.out.println();
            System.out.print("Deseja adicionar outro? (S/N): ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            if(option != 'S'){
                broadband = false;
            }
        } while(broadband);

        // PLANOS MOVEIS
        do {
            System.out.print("Nome do Plano Móvel: ");
            String plano = sc.nextLine();

            System.out.print("Quantia de dados do plano: ");
            String dados = sc.nextLine();

            System.out.print("Valor da mensalidade: ");
            double mensalidade = sc.nextDouble();

            products.add(new MobileProduct(plano, mensalidade, dados));

            System.out.println();
            System.out.print("Deseja adicionar outro? (S/N): ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            if(option != 'S'){
                mobile = false;
            }
        } while(mobile);

        do {
            // PLANOS COMBO
            System.out.print("Nome do plano Combo: ");
            String plano = sc.nextLine();
            int item;

            ComboProduct combo = new ComboProduct(plano, new ArrayList<Product>());

            System.out.println("Selecione um Plano Móvel: ");
            for (Product p : products) {
                if (p instanceof MobileProduct)
                    System.out.println(products.indexOf(p) + " - " + p.getNome());
            }
            item = sc.nextInt();
            combo.addProducts(products.get(item));
            System.out.println();

            System.out.println("Selecione um Plano Banda Larga: ");
            for (Product p : products) {
                if (p instanceof BroadBandProduct)
                    System.out.println(products.indexOf(p) + " - " + p.getNome());
            }
            item = sc.nextInt();
            combo.addProducts(products.get(item));
            System.out.println();

            System.out.println("Selecione um Plano de TV: ");
            for (Product p : products) {
                if (p instanceof PayTVProduct)
                    System.out.println(products.indexOf(p) + " - " + p.getNome());
            }
            item = sc.nextInt();
            combo.addProducts(products.get(item));
            System.out.println();

            products.add(combo);

            System.out.print("Deseja adicionar outro? (S/N): ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            if(option != 'S'){
                bundle = false;
            }
        } while (bundle);

        System.out.println("Produtos cadastrados:");
        for (Product pro : products)
            System.out.println(pro);

        sc.close();
    }
}