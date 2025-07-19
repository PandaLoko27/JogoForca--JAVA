package jogo;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibir() {
        int opcao;
        do {
            System.out.println("\n--- JOGO DA FORCA ---");
            System.out.println("1. Iniciar novo jogo");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> iniciarJogo();
                case 2 -> System.out.println("\nAté a próxima!");
                default -> System.out.println("\nOpção inválida! [Selecione a opção entre 1 e 2]");
            }
        } while (opcao != 2);
    }

    private void iniciarJogo() {
        PalavraSecreta palavra = new PalavraSecreta();
        Forca forca = new Forca(palavra);
        forca.jogar(scanner);
    }
}
