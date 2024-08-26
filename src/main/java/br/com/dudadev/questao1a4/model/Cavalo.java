package br.com.dudadev.questao1a4.model;

public class Cavalo extends Animal implements ICorredor{

    public Cavalo(){
        super();
    }
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando");
    }

    @Override
    public void correr() {
        System.out.println("O cavalo está correndo");
    }
}
