package service;

import model.Chordata;
import model.enums.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

    // #1
    public void listarTodosAnimais() {
        System.out.println("\n-- Lista de todos os animais --");
        List<Chordata> animais = getTodosAnimais();
        for (int i = 0; i < animais.size(); i++) {
            System.out.println((i + 1) + " - " + animais.get(i).getNomePopular());
        }
    }

    // #2
    public void buscarPorNome(String nome) {
        for (Chordata animal : animais) {
            if (animal.getNomePopular().toLowerCase().contains(nome.toLowerCase())) {
                animal.exibirInfo();
            }
        }
    }

    public void verDetalhes(Scanner scanner) {
        System.out.print("Digite o índice do animal (veja na listagem): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        if (index >= 1 && index < animais.size()) {
            Chordata animal = animais.get(index - 1);
            animal.exibirInfo();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // #3

    // #4
    public List<Chordata> filtrarPorAlimentacao(TipoAlimentacao tipo) {
        return animais.stream()
                .filter(a -> a.getAlimentacao() == tipo)
                .collect(Collectors.toList());
    }

    // #5
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

    // #6
    public void listarPorModoLocomocao(ModoLocomocao modo) {
        for (Chordata animal : animais) {
            if (animal.getModoLocomocao() == modo) {
                animal.exibirInfo();
            }
        }
    }

    public List<Chordata> filtrarPorLocomocao(ModoLocomocao modo) {
        return animais.stream()
                .filter(animal -> animal.getModoLocomocao() == modo)
                .collect(Collectors.toList());
    }

    // #7
    public void filtrarPorTipoPele(Scanner scanner) {
        TipoPele[] tipos = TipoPele.values();

        System.out.println("Escolha o tipo de pele:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + ". " + formatarTipoPele(tipos[i]));
        }

        System.out.print("Digite o número correspondente: ");
        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            if (escolha < 1 || escolha > tipos.length) {
                System.out.println("Opção inválida.");
                return;
            }

            TipoPele tipoSelecionado = tipos[escolha - 1];
            List<Chordata> filtrados = animais.stream()
                    .filter(animal -> animal.getTipoPele() == tipoSelecionado)
                    .collect(Collectors.toList());

            System.out.println("\nAnimais com pele " + formatarTipoPele(tipoSelecionado) + ":");
            if (filtrados.isEmpty()) {
                System.out.println("Nenhum animal encontrado.");
            } else {
                filtrados.forEach(System.out::println);
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número.");
        }
    }

    private String formatarTipoPele(TipoPele tipo) {
        switch (tipo) {
            case PELOS:
                return "Pelos";
            case PENAS:
                return "Penas";
            case ESCAMAS:
                return "Escamas";
            case PELE_LISA:
                return "Pele lisa";
            case CASCO:
                return "Casco";
            case UMIDA:
                return "Úmida";
            default:
                return tipo.name(); // fallback
        }
    }

    // #8
    public void listarPorRespiracao(TipoRespiracao tipo) {
        for (Chordata animal : animais) {
            if (animal.getTipoRespiracao() == tipo) {
                animal.exibirInfo();
            }
        }
    }

    public void filtrarPorTipoRespiracao(Scanner scanner) {
        TipoRespiracao[] tipos = TipoRespiracao.values();

        System.out.println("Escolha o tipo de respiração:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + ". " + formatarTipoRespiracao(tipos[i]));
        }

        System.out.print("Digite o número correspondente: ");
        try {
            int escolha = Integer.parseInt(scanner.nextLine());

            if (escolha < 1 || escolha > tipos.length) {
                System.out.println("Opção inválida.");
                return;
            }

            TipoRespiracao selecionado = tipos[escolha - 1];

            List<Chordata> filtrados = animais.stream()
                    .filter(animal -> animal.getTipoRespiracao() == selecionado)
                    .collect(Collectors.toList());

            System.out.println("\nAnimais com respiração " + formatarTipoRespiracao(selecionado) + ":");
            if (filtrados.isEmpty()) {
                System.out.println("Nenhum animal encontrado.");
            } else {
                filtrados.forEach(System.out::println);
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número.");
        }
    }

    private String formatarTipoRespiracao(TipoRespiracao tipo) {
        return tipo.name()
                .toLowerCase()
                .replace("_", " ")
                .substring(0, 1).toUpperCase() +
                tipo.name().toLowerCase().replace("_", " ").substring(1);
    }

    // #9
    public void filtrarPorTipoSom(Scanner scanner) {
        System.out.println("\nEscolha o tipo de som:");

        TipoSom[] tipos = TipoSom.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + " - " + tipos[i].getDescricao());
        }

        System.out.print("Digite a opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (opcao < 1 || opcao > tipos.length) {
            System.out.println("Opção inválida.");
            return;
        }

        TipoSom selecionado = tipos[opcao - 1];

        List<Chordata> resultado = animais.stream()
                .filter(a -> a.getTipoSom() == selecionado)
                .toList();

        if (resultado.isEmpty()) {
            System.out.println("Nenhum animal encontrado com esse tipo de som.");
        } else {
            System.out.println("\nAnimais com " + selecionado.getDescricao() + ":");
            resultado.forEach(a -> System.out.println("- " + a.getNomePopular() + " (Som: " + a.getSomEmitido() + ")"));
        }
    }

}
