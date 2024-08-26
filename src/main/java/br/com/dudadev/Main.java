package br.com.dudadev;

import br.com.dudadev.model.Cachorro;
import br.com.dudadev.model.Cavalo;
import br.com.dudadev.model.Preguica;
import br.com.dudadev.model.Veterinario;

public class Main {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("jupter", 5);
        Cachorro cachorro = new Cachorro("Hannah", 13);
        Preguica preguica = new Preguica("zooboomafu", 7);
        Veterinario veterinario = new Veterinario();

        cavalo.emitirSom();
        cachorro.emitirSom();
        preguica.emitirSom();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}