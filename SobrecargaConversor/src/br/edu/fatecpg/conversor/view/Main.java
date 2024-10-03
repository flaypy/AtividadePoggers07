package br.edu.fatecpg.conversor.view;

import br.edu.fatecpg.conversor.model.Conversor;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        System.out.println(conversor.converter(30.0));
        System.out.println(conversor.converter(2000));
        System.out.println(conversor.converter("poggers"));
    }
}
