import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SecondHighest {
    public static void main(String[] args) {
        String s = "javacd is easy to learn";
        String secondLongest = Arrays.stream(s.split(" "))
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();

                System.out.println(secondLongest);
                
    }
}
 