package view;

import model.Chordata;
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
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Listar todos os animais");
            System.out.println("2. Filtrar por classe (Mamífero, Ave, Anfibio, Peixe ou Reptil)");
            //System.out.println("3. Filtrar por dieta (Herbívoro, Carnívoro, etc)"); IMPLEMENTAR
            System.out.println("4. Ver detalhes de um animal");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1 -> listarTodos();
                case 2 -> filtrarPorClasse();
                //case 3 -> filtrarPorDieta(); IMPLEMENTAR
                case 4 -> verDetalhes();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private void listarTodos() {
        System.out.println("\n-- Lista de todos os animais --");
        List<Chordata> animais = animalService.getTodosAnimais();
        for (int i = 0; i < animais.size(); i++) {
            System.out.println(i + " - " + animais.get(i).getNomePopular());
        }
    }

    private void filtrarPorClasse() {
        System.out.print("Digite a classe (MAMIFERO, AVE, ANFIBIO, PEIXE ou REPTIL): ");
        String classeInput = scanner.nextLine().toUpperCase();
        List<Chordata> filtrados = animalService.getAnimaisPorClasse(classeInput);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado para a classe informada.");
        } else {
            filtrados.forEach(a -> System.out.println("- " + a.getNomePopular()));
        }
    }
    
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
}

