package br.com.dudadev.questao1a4;

import br.com.dudadev.questao1a4.model.*;

public class Main {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("jupter", 5);
        Cachorro cachorro = new Cachorro("Hannah", 13);
        Preguica preguica = new Preguica("zooboomafu", 7);
        Veterinario veterinario = new Veterinario();
        Zoologico zoologico = new Zoologico();

        cavalo.emitirSom();
        cachorro.emitirSom();
        preguica.emitirSom();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        zoologico.adicionarAnimal(new Cavalo());
        zoologico.adicionarAnimal(new Preguica());
        zoologico.adicionarAnimal(new Cachorro());
        zoologico.adicionarAnimal(new Preguica());
        zoologico.adicionarAnimal(new Cavalo());
        zoologico.adicionarAnimal(new Preguica());
        zoologico.adicionarAnimal(new Cachorro());
        zoologico.adicionarAnimal(new Cavalo());
        zoologico.adicionarAnimal(new Preguica());
        zoologico.adicionarAnimal(new Cachorro());

        zoologico.exibirAnimais();
    }
}