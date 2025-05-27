import java.util.*;
import java.util.stream.*;
public class Record {
    public record Person(String name,int age){}
    public static void main(String[] args){
        Person p1=new Person("harika",19);
        Person p2=new Person("neeraja",21);
        Person p3=new Person("vamsi",56);
        Person p4=new Person("siva",16);

        List<Person> lt=new ArrayList<>();
        lt.add(p1);
        lt.add(p2);
        lt.add(p3);
        lt.add(p4);

        List<Person> ans=lt.stream().filter(n-> n.age()>20).collect(Collectors.toList());
        for(Person p:ans){
            System.out.println(p);
        }



        
    }

    
}
