package br.com.dudadev.model;

public class Veterinario {
    public void examinar(Animal animal){

        System.out.println( animal.getNome() + " será examinado/a");
        for(int i = 0; i < 3; i++){
            animal.emitirSom();
        }
        System.out.println(animal.getNome() + " foi examinado/a");
    }
}
