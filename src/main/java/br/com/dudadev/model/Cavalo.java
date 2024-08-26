package br.com.dudadev.model;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("O cavalo está relinchando");
    }

    @Override
    void moverSe() {
        System.out.println("O cavalo está correndo");
    }
}
