package br.com.dudadev;

import br.com.dudadev.model.Cachorro;
import br.com.dudadev.model.Cavalo;
import br.com.dudadev.model.Preguica;

public class Main {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("jupter", 5);
        Cachorro cachorro = new Cachorro("Hannah", 13);
        Preguica preguica = new Preguica("zooboomafu", 7);

        cavalo.emitirSom();
        cachorro.emitirSom();
        preguica.emitirSom();
    }
}