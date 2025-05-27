import java.util.*;
import java.util.stream.*;
public class Streamapi {
    public static void main(String[] args){
        List<Integer> lt=new ArrayList<>();
        lt.add(19);
        
        lt.add(56);
        lt.add(11);
        lt.add(16);
        lt.add(86);

        lt=lt.stream().filter(n ->n%2==0).collect(Collectors.toList());
        for(int a:lt){
            System.out.println(a);
        }


    }
    
}
