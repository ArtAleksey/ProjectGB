import java.util.Random;
import java.util.Scanner;

public class TicTacToeMy {

    static final char EMPTY_CELL_SYMBOL = '-';

    public static void start(int size) {
        char[][] field = new char[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = EMPTY_CELL_SYMBOL;
            }
        }

        drawField(field);

        do {
            doPlayerMove(field, size);
            drawField(field);
            if (isWin(field, 'X')) {
                System.out.println("Congratulations!!! You are winner.");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!");
                break;
            }

            doBotMove(field);
            drawField(field);
            if (isWin(field, 'O')) {
                System.out.println("Sorry!!! You are loser. :(");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!");
                break;
            }
        } while (true);

    }


    static boolean isDraw(char[][] field) {
        for (int v = 0; v < field.length; v++) {
            for (int h = 0; h < field.length; h++) {
                if (isEmptyCell(field, v, h)) {
                    return false;
                }
            }
        }
        return true;
    }


    static boolean isEmptyCell(char[][] field, int v, int h) {

        return field[v][h] == EMPTY_CELL_SYMBOL;
    }

    static boolean isNotEmptyCell(char[][] field, int v, int h) {
        return !isEmptyCell(field, v, h);
    }

    static boolean isWin(char[][] field, char sign) {
        int countForWin = 0;
        // Horizontal
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == sign) {
                    countForWin++;
                    if (countForWin >= 3){
                        return true;
                    }
                } else {
                    countForWin = 0;
                }
            }
        }
        countForWin = 0;

        // Vertical
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == sign) {
                    countForWin++;
                    if (countForWin >= 3){
                        return true;
                    }
                } else {
                    countForWin = 0;
                }
            }
        }
        countForWin = 0;

        // Diagonal 1
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (i == j) {
                    if (field[i][j] == sign) {
                        countForWin++;
                        if (countForWin >= 3) {
                            return true;
                        }
                    } else {
                        countForWin = 0;
                    }
                }
            }
        }
        countForWin = 0;

        //Diagonal 2
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == (field.length - i - 1)) {
                    if (field[i][j] == sign) {
                        countForWin++;
                        if (countForWin >= 3){
                            return true;
                        }
                    } else {
                        countForWin = 0;
                    }
                }
            }
        }

        return false;
    }

    static void doBotMove(char[][] field) {
        Random random = new Random();

        int v, h;
        do {
            v = random.nextInt(field.length);
            h = random.nextInt(field.length);
        } while (isNotEmptyCell(field, v, h));

        field[v][h] = 'O';
    }

    static void doPlayerMove(char[][] field, int size) {
        int v, h;
        do {
            v = getCoordinate(field, 'v', size);
            h = getCoordinate(field, 'h', size);
        } while (isNotEmptyCell(field, v, h));

        field[v][h] = 'X';
    }

    static int getCoordinate(char[][] field, char coordinateName, int size) {
        Scanner scanner = new Scanner(System.in);

        int coordinate;
        do {
            System.out.printf("Please enter %s-coordinate [1..%s] ...%n", coordinateName, size);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= field.length);

        return coordinate;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
    }

}