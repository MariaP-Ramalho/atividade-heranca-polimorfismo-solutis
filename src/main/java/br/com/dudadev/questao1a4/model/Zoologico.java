package br.com.dudadev.questao1a4.model;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private final List<Animal> jaulas;

    public Zoologico() {
        this.jaulas = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        if (jaulas.size() < 10) {
            jaulas.add(animal);
        } else {
            System.out.println("Todas as jaulas estão ocupadas!");
        }
    }

    public void exibirAnimais() {
        for (int i = 0; i < jaulas.size(); i++) {
            Animal animal = jaulas.get(i);
            System.out.println("Jaula " + (i + 1) + ": ");
            animal.emitirSom();
            if (animal instanceof ICorredor) {
                ((ICorredor) animal).correr();
            }
            System.out.println("----------------------");
        }
    }
}

