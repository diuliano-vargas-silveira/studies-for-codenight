import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex2028 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int caseCounter = 1;

        while ((input = bufferedReader.readLine()) != null) {
            List<Integer> lista = new ArrayList<>();

            int numberCase = Integer.parseInt(input);
            int counter = 0;

            while (counter <= numberCase) {
                if (counter == 0) {
                    lista.add(counter);
                }

                for (int i = 0; i < counter; i++) {
                    lista.add(counter);
                }

                counter++;
            }


            if (lista.size() > 1) {
                System.out.printf("Caso %d: %d numeros\n", caseCounter, lista.size());
            } else {
                System.out.printf("Caso %d: %d numero\n", caseCounter, lista.size());
            }
            String presentation = lista.toString().replace(",", "")
                    .replace("[", "")
                    .replace("]", "");
            System.out.println(presentation);
            System.out.println();

            caseCounter++;
        }

    }
}
