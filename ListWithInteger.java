import java.util.*;
import java.util.stream.Collectors;

public class ListWithInteger {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList("Hello", "10", "World", "25", "3.14", "Java", 42);

        List<Integer> numbers = mixedList.stream()
                                         .map(Object::toString)                 // convert to String
                                         .filter(s -> s.matches("[0-9]+"))      // keep only integers
                                         .map(Integer::valueOf)                 // convert to Integer
                                         .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
