import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1030 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int useCases = scanner.nextInt();

        for (int i = 0; i < useCases; i++) {
            int numberOfPeople = scanner.nextInt();
            int jumpSize = scanner.nextInt();

            List<Integer> pessoas = new ArrayList<>();

            for (int j = 1; j <= numberOfPeople; j++) {
                pessoas.add(j);
            }

            int index = 0;
            while(pessoas.size() > 1) {
                index += jumpSize - 1;
                if (index >= pessoas.size()) {
                    index = index % pessoas.size();
                }
                pessoas.remove(index);
            }

            System.out.println("Case " + (i + 1) + ": " + pessoas.get(0));
        }


    }

}
