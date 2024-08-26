package br.com.dudadev.questao1a4.model;


public class Preguica extends Animal{

    public Preguica(){
        super();
    }
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está chiando");
    }

    public void escalar() {
        System.out.println("A preguiça está subindo em árvores");
    }
}
