import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Победа при 3 последовательных X/O");
        System.out.println("Введите размер поля: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        TicTacToeMy.start(size);
    }
}
