package jogo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PalavraSecreta {
    private String palavra;
    private Set<Character> letrasReveladas = new HashSet<>();

    public PalavraSecreta() {
        String[] palavras = {
            "banana", "computador", "java", "programacao", "desenvolvimento",
            "internet", "teclado", "monitor", "mouse", "sistema",
            "interface", "algoritmo", "ovo", "banco", "dados",
            "seguranca", "navegador", "compilador", "engenharia", "software"
        };
        this.palavra = palavras[new Random().nextInt(palavras.length)];
    }

    public boolean verificarLetra(char letra) {
        if (palavra.indexOf(letra) != -1) {
            letrasReveladas.add(letra);
            return true;
        }
        return false;
    }

    public boolean estaCompleta() {
        for (char c : palavra.toCharArray()) {
            if (!letrasReveladas.contains(c)) return false;
        }
        return true;
    }

    public String getPalavraComEspacos() {
        StringBuilder sb = new StringBuilder();
        for (char c : palavra.toCharArray()) {
            if (letrasReveladas.contains(c)) sb.append(c).append(" ");
            else sb.append("_ ");
        }
        return sb.toString();
    }

    public String getPalavraCompleta() {
        return palavra;
    }
}
