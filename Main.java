import java.util.Scanner;
import jogo.Menu;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.exibir();
        scanner.close();
    }
}
