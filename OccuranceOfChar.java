import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfChar {
    public static void main(String[] args) {
        String s="programming in java";
        Map<String,Long> count=Arrays.stream(s.split(""))
        .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(count);
    }
}
