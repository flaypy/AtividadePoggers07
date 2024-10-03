package br.edu.fatecpg.produto.view;

import br.edu.fatecpg.produto.model.Produto;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis");
        Produto p2 = new Produto("Lapis", 1.99);
        Produto p3 = new Produto("Lapis", 1.99, 52000);

        p1.imprimirInfo();
        p2.imprimirInfo();
        p3.imprimirInfo();
    }

}
