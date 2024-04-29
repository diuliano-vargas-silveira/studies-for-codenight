import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1171 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int quantityOfNumbers = scanner.nextInt();

        for (int i = 0; i < quantityOfNumbers; i++) {
            numbers.add(scanner.nextInt());
        }

        numbers.stream().sorted().distinct().forEach(number -> {
            long quantity = numbers.stream().filter(n -> n.equals(number)).count();
            System.out.println(number + " aparece " + quantity + " vez(es)");
        });

    }

}
