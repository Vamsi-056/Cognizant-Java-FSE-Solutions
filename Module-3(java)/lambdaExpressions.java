import java.util.*;
public class lambdaExpressions {
    public static void main(String[] args){
    List<String> arr=new ArrayList<>();
    arr.add("vamsi");
    arr.add("siva");
    arr.add("pavan");
    arr.add("eswar");
    arr.add("ravi");

    Collections.sort(arr,(a,b)->a.compareToIgnoreCase(b));

    for(String s:arr){
    System.out.println(s);
    }
}
    
}
