package service;

import model.Chordata;
import model.enums.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    private List<Chordata> animais;

    public AnimalService(List<Chordata> animais) {
        this.animais = animais;
    }

    // Requisitado pelo MainMenu
    public List<Chordata> getTodosAnimais() {
        return new ArrayList<>(animais);
    }

    public Chordata getAnimalPorIndice(int index) {
        if (index >= 0 && index < animais.size()) {
            return animais.get(index);
        }
        return null;
    }

    public List<Chordata> getAnimaisPorClasse(String classeInput) {
        List<Chordata> resultado = new ArrayList<>();
        try {
            ClasseAnimal classe = ClasseAnimal.valueOf(classeInput);
            for (Chordata animal : animais) {
                if (animal.getClasseAnimal() == classe) {
                    resultado.add(animal);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Classe inválida: " + classeInput);
        }
        return resultado;
    }

    // Métodos extras úteis
    public void listarPorRespiracao(TipoRespiracao tipo) {
        for (Chordata animal : animais) {
            if (animal.getTipoRespiracao() == tipo) {
                animal.exibirInfo();
            }
        }
    }

        public void listarPorModoLocomocao(ModoLocomocao modo) {
        for (Chordata animal : animais) {
            if (animal.getModoLocomocao() == modo) {
                animal.exibirInfo();
            }
        }
    }

    public void buscarPorNome(String nome) {
        for (Chordata animal : animais) {
            if (animal.getNomePopular().toLowerCase().contains(nome.toLowerCase())) {
                animal.exibirInfo();
            }
        }
    }
}

