import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurance {
    public static void main(String[] args) {
        String s = "mississippi";

        Map<Character, Long> m = s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(m);
    }
}
