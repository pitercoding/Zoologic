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
            System.out.println("3. Filtro: Classe");
            System.out.println("4. Filtro: Alimentação");
            System.out.println("5. Filtro: Habitat");
            System.out.println("6. Filtro: Locomoção");
            System.out.println("7. Filtro: Pele");
            System.out.println("8. Filtro: Respiração");

            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1 -> animalService.listarTodosAnimais();
                case 2 -> animalService.verDetalhes(scanner); 
                case 3 -> filtrarPorClasse();
                case 4 -> filtrarPorAlimentacao();
                case 5 -> filtrarPorCategoriaHabitat();
                case 6 -> filtrarPorLocomocaoMenu(scanner, animalService);
                case 7 -> animalService.filtrarPorTipoPele(scanner);
                case 8 -> animalService.filtrarPorTipoRespiracao(scanner);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    //#3
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
    
    //#4
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

    //#6
    private static void filtrarPorLocomocaoMenu(Scanner scanner, AnimalService service) {
        System.out.println("Escolha o modo de locomoção:");
        for (ModoLocomocao modo : ModoLocomocao.values()) {
            System.out.println(modo.ordinal() + " - " + modo);
        }
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
    
        if (escolha >= 0 && escolha < ModoLocomocao.values().length) {
            ModoLocomocao modoSelecionado = ModoLocomocao.values()[escolha];
            List<Chordata> resultado = service.filtrarPorLocomocao(modoSelecionado);
    
            if (resultado.isEmpty()) {
                System.out.println("Nenhum animal encontrado com esse modo de locomoção.");
            } else {
                System.out.println("Animais com locomoção " + modoSelecionado + ":");
                resultado.forEach(System.out::println);
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }
    
}

