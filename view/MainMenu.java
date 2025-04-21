package view;

import model.Chordata;
import model.enums.*;
import service.AnimalService;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private final AnimalService animalService;
    private final Scanner scanner;

    public MainMenu(AnimalService animalService) {
        this.animalService = animalService;
        this.scanner = new Scanner(System.in);
    }

    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU PRINCIPAL ZOOLOGIC =====");
            System.out.println("1. Listar todos os animais");
            System.out.println("2. Ver detalhes de um animal específico");
            System.out.println("3. Filtrar animais por classe (Mamífero, Ave, Anfibio, Peixe ou Reptil)");
            System.out.println("4. Filtrar animais por tipo de alimentação");
            System.out.println("5. Filtrar animais por habitat");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1 -> listarTodos();
                case 2 -> verDetalhes(); 
                case 3 -> filtrarPorClasse();
                case 4 -> filtrarPorAlimentacao();
                case 5 -> filtrarPorCategoriaHabitat();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    //#1
    private void listarTodos() {
        System.out.println("\n-- Lista de todos os animais --");
        List<Chordata> animais = animalService.getTodosAnimais();
        for (int i = 0; i < animais.size(); i++) {
            System.out.println(i + " - " + animais.get(i).getNomePopular());
        }
    }

    //#2
    private void filtrarPorClasse() {
        System.out.println("\nDigite a classe:");
        System.out.println("1 - Mamífero");
        System.out.println("2 - Ave");
        System.out.println("3 - Anfíbio");
        System.out.println("4 - Peixe");
        System.out.println("5 - Réptil");
        System.out.print("Escolha uma opção: ");
    
        int opcaoClasse = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer
    
        String classeInput = "";
    
        switch (opcaoClasse) {
            case 1 -> classeInput = "MAMIFERO";
            case 2 -> classeInput = "AVE";
            case 3 -> classeInput = "ANFIBIO";
            case 4 -> classeInput = "PEIXE";
            case 5 -> classeInput = "REPTIL";
            default -> {
                System.out.println("Opção inválida.");
                return;
            }
        }
    
        List<Chordata> filtrados = animalService.getAnimaisPorClasse(classeInput);
    
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado para a classe informada.");
        } else {
            System.out.println("\nAnimais da classe " + classeInput + ":");
            filtrados.forEach(a -> System.out.println("- " + a.getNomePopular()));
        }
    }
    
    //#3
    private void filtrarPorAlimentacao() {
        System.out.println("\nSelecione o tipo de alimentação:");
        for (int i = 0; i < TipoAlimentacao.values().length; i++) {
            System.out.println((i + 1) + " - " + TipoAlimentacao.values()[i]);
        }
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer
    
        if (opcao >= 1 && opcao <= TipoAlimentacao.values().length) {
            TipoAlimentacao tipoSelecionado = TipoAlimentacao.values()[opcao - 1];
            List<Chordata> filtrados = animalService.filtrarPorAlimentacao(tipoSelecionado);
    
            if (filtrados.isEmpty()) {
                System.out.println("Nenhum animal encontrado com esse tipo de alimentação.");
            } else {
                System.out.println("\nAnimais encontrados:");
                filtrados.forEach(a -> System.out.println("- " + a.getNomePopular() + " (" + tipoSelecionado + ")"));
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }    
    
    //#4
    private void verDetalhes() {
        System.out.print("Digite o índice do animal (veja na listagem): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Chordata animal = animalService.getAnimalPorIndice(index);
        if (animal != null) {
            animal.exibirInfo();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    //#5
    private void filtrarPorCategoriaHabitat(){
        System.out.println("\nSelecione a categoria de habitat:");
        System.out.println("1 - Aquático");
        System.out.println("2 - Florestal");
        System.out.println("3 - Terrestre");
        System.out.println("4 - Urbano");
        System.out.print("Escolha uma opção: ");
        int opcaoHabitat = scanner.nextInt();
        CategoriaHabitat categoriaSelecionada = null;
    
        switch (opcaoHabitat) {
            case 1: categoriaSelecionada = CategoriaHabitat.AQUATICO; break;
            case 2: categoriaSelecionada = CategoriaHabitat.FLORESTAL; break;
            case 3: categoriaSelecionada = CategoriaHabitat.TERRESTRE; break;
            case 4: categoriaSelecionada = CategoriaHabitat.URBANO; break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    
        if (categoriaSelecionada != null) {
            List<Chordata> todosAnimais = animalService.getTodosAnimais();
            List<Chordata> filtrados = animalService.filtrarPorCategoriaHabitat(todosAnimais, categoriaSelecionada);

            System.out.println("\nAnimais encontrados:");
            filtrados.forEach(a -> System.out.println(a.getNomePopular() + " - " + a.getHabitat()));
        }
    }


}

