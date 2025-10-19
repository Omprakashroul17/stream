import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeEle {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 6, 9, 8, 4};

        List<Integer> b = Arrays.stream(a)
                .boxed()        // convert IntStream -> Stream<Integer>
                .sorted()       
                .collect(Collectors.toList()); 

        System.out.println(b);
    }
}
