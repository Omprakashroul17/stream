import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s="ommprakashroul";
       char ch= s.chars()
       .mapToObj(c->(char)c)
       .collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()))
       .entrySet().stream().filter(k->k.getValue()==1)
       .map(Map.Entry::getKey).findFirst().orElse( null);
       System.out.println(ch);
    }
}
