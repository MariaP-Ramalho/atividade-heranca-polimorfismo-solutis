package br.com.dudadev.questao1a4.model;

public class Cachorro extends Animal implements ICorredor{

    public Cachorro(){
        super();
    }
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo");
    }

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo");
    }
}
