import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="programming in java is fun and java is powerful";
        Arrays.stream(s.split(""))
                .distinct()
                .forEach(System.out::println);
    }
}
