import java.util.Arrays;

public class SumOfUniqueEle {
    public static void main(String[] args) {
        int []a={12,34,54,54,65,87,63};
       int sum= Arrays.stream(a).distinct().sum();//reduce(0,(c,e)->c+e );
       System.out.println(sum);
    }
}
