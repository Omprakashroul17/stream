import java.util.*;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};

        Map<Boolean, List<Integer>> partitioned = 
            Arrays.stream(a) 
                  .boxed()   
                  .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
    }
}
