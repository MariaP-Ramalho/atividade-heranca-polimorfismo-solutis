package br.com.dudadev.model;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("O cachorro está latindo");
    }

    @Override
    void moverSe() {
        System.out.println("O cachorro está correndo");
    }
}
