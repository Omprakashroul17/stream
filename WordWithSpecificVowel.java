import java.util.Arrays;

public class WordWithSpecificVowel {
    public static void main(String[] args) {
        String s = "education is the key to success";
        Arrays.stream(s.split(" "))
                .filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
    }
}
