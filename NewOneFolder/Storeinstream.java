package NewOneFolder;

import java.util.Arrays;
import java.util.List;


public class Storeinstream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
        int result= num.stream()
                        .filter(n-> n%2==0)
                        
                        .map(n-> n*2)
                        .reduce(0, (c,e)->c+e);
        System.out.println(result);

    }

}
