package service;

import model.Chordata;
import model.enums.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Chordata> filtrarPorCategoriaHabitat(List<Chordata> animais, CategoriaHabitat categoria) {
    return animais.stream()
        .filter(animal -> {
            String habitat = animal.getHabitat().toLowerCase();

            switch (categoria) {
                case AQUATICO:
                    return habitat.contains("oceano") || habitat.contains("água") ||
                           habitat.contains("lago") || habitat.contains("rio") ||
                           habitat.contains("recife") || habitat.contains("polar");
                case FLORESTAL:
                    return habitat.contains("floresta") || habitat.contains("árvore") ||
                           habitat.contains("mata") || habitat.contains("cerrado");
                case TERRESTRE:
                    return habitat.contains("terra") || habitat.contains("savana") ||
                           habitat.contains("deserto") || habitat.contains("montanha") ||
                           habitat.contains("campo") || habitat.contains("estepe");
                case URBANO:
                    return habitat.contains("urbano");
                default:
                    return false;
            }
        })
        .collect(Collectors.toList());
    }

    public List<Chordata> filtrarPorAlimentacao(TipoAlimentacao tipo) {
        return animais.stream()
            .filter(a -> a.getAlimentacao() == tipo)
            .collect(Collectors.toList());
    }
    
}

