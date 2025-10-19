import java.util.Arrays;
import java.util.Comparator;

public class HighestLengthString {
    public static void main(String[] args) {
      String s="java is easy to learn";
      String longest=Arrays.stream(s.split(" "))
              .max (Comparator.comparingInt(String::length))
              .get();
        System.out.println(longest);
}
}