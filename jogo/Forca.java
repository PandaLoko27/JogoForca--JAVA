package jogo;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Forca {
    private PalavraSecreta palavraSecreta;
    private int tentativasRestantes = 6;
    private Set<Character> letrasErradas = new HashSet<>();
    private Set<Character> letrasUsadas = new HashSet<>(); // Novo conjunto para todas as letras já tentadas

    public Forca(PalavraSecreta palavraSecreta) {
        this.palavraSecreta = palavraSecreta;
    }

    public void jogar(Scanner scanner) {
        while (tentativasRestantes > 0 && !palavraSecreta.estaCompleta()) {
            exibirEstado();
            System.out.print("Digite uma letra: ");
            String entrada = scanner.nextLine().toLowerCase();

            if (entrada.isEmpty()) {
                System.out.println("Digite uma letra válida!");
                continue;
            }

            char letra = entrada.charAt(0);

            if (!Character.isLetter(letra)) {
                System.out.println("Digite uma letra válida!");
                continue;
            }

            if (letrasUsadas.contains(letra)) {
                System.out.println("\nVocê já tentou essa letra!");
                continue;
            }

            letrasUsadas.add(letra); // Adiciona ao conjunto de letras já usadas

            if (palavraSecreta.verificarLetra(letra)) {
                System.out.println("\nAcertou!");
            } else {
                letrasErradas.add(letra);
                tentativasRestantes--;
                System.out.println("\nErrou! Tentativas restantes: " + tentativasRestantes);
            }
        }

        if (palavraSecreta.estaCompleta()) {
            System.out.println("\nParabéns! Você acertou a palavra: " + palavraSecreta.getPalavraCompleta());
        } else {
            System.out.println("\nVocê perdeu! A palavra era: " + palavraSecreta.getPalavraCompleta());
        }
    }

    private void exibirEstado() {
        System.out.println("\n" + getForcaBoneco());
        System.out.println("Palavra: " + palavraSecreta.getPalavraComEspacos());
        System.out.println("Letras erradas: " + letrasErradas);
    }

    private String getForcaBoneco() {
        String[] boneco = new String[7];
        boneco[0] = "-----";
        boneco[1] = "|    |";
        boneco[2] = tentativasRestantes <= 5 ? "|    0" : "|";
        if (tentativasRestantes <= 2) {
            boneco[3] = "|   /|\\";
        } else if (tentativasRestantes == 3) {
            boneco[3] = "|   /|";
        } else if (tentativasRestantes == 4) {
            boneco[3] = "|    |";
        } else {
            boneco[3] = "|";
        }

        if (tentativasRestantes <= 0) {
            boneco[4] = "|   / \\";
        } else if (tentativasRestantes == 1) {
            boneco[4] = "|   /";
        } else {
            boneco[4] = "|";
        }

        boneco[5] = "|";
        boneco[6] = "=====";

        return String.join("\n", boneco);
    }
}
