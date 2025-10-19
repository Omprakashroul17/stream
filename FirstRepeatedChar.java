import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String s="ompprakashroul";
     Character ch=s.chars().mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(a->a.getValue()>=2)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);

        System.out.println(ch);
    }
}
