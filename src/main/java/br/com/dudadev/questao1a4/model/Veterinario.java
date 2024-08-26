package br.com.dudadev.questao1a4.model;

public class Veterinario {
    public void examinar(Animal animal){

        System.out.println( animal.getNome() + " será examinado/a");
        for(int i = 0; i < 3; i++){
            animal.emitirSom();
        }
        System.out.println(animal.getNome() + " foi examinado/a");
    }
}
