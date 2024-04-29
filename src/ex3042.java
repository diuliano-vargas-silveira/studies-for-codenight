import java.util.Scanner;

public class ex3042 {

    public static int nonBlockedPaths(String[][] board, int newX) {
        for (int y = 0; y < 3; y++) {
            if (board[newX][y].equals("0"))
                return y;
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int boardLength;

        while ((boardLength = scanner.nextInt())  != 0) {
            int screenTouches = 0;
            int santaClausX = 0;
            int santaClausY = 1;
            String[][] board = new String[boardLength][3];


            for (int i = 0; i < boardLength; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = scanner.next();
                }
            }

            if (board[santaClausX][santaClausY].equals("1")) {
                int newSantaY = nonBlockedPaths(board, santaClausX);
                screenTouches += Math.abs(santaClausY - newSantaY);
                santaClausY = newSantaY;
            }

            for (int i = 0; i < boardLength - 1; i++) {
                santaClausX++;
                if (!board[santaClausX][santaClausY].equals("0")) {
                    int newSantaY = nonBlockedPaths(board, santaClausX);
                    screenTouches += Math.abs(santaClausY - newSantaY);
                    santaClausY = newSantaY;
                }
            }
            System.out.println(screenTouches);
        }
    }
}
