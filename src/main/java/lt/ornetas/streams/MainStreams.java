package lt.ornetas.streams;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class MainStreams {
    public static void main(String[] args) {


        List<String> sarasas = Arrays.asList("a9", "a2", "b9", "b3", "b5", "b6", "bc8", "ba7");
        List<String> modifikuotasSarasas;

        System.out.println(sarasas);

        modifikuotasSarasas=sarasas.stream()
                .filter(elementas->elementas.contains("b"))
                .map(elementas->elementas + "_" + LocalDateTime.now().getNano())
                .toList();
        System.out.println(modifikuotasSarasas);

        sarasas.stream()
                .filter(elementas->elementas.contains("b"))
                .map(elementas->elementas + "_" + LocalDateTime.now().getNano())
                .forEach(System.out::println);


    }
}
