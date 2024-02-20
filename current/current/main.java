package current;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class emp{
    String name;
    int id;
    int age;
    emp(String name,int id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

}
public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<emp> e = new ArrayList<emp>();
        e.add(new emp("anil", 10000, 60));
        e.add(new emp("dinesh", 15000, 60));
        e.add(new emp("dinesh", 16000, 70));
        e.add(new emp("anil", 17000, 40));
        
        Map<Integer,List<emp>> q= e.stream().collect(Collectors.groupingBy(x->x.getAge()));
System.out.println(q);        
//        int[] a = {2, 12, 1, 2, 3, 4};
//        String c="Hello World";
//        Map<Character, Integer> wordCountMap = new HashMap<>();
//        for(char i:c.toCharArray()) {
//            wordCountMap.put(i, wordCountMap.getOrDefault(i,0)+1);
//        }
//        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));         
//        List l=Arrays.stream(a).boxed().collect(Collectors.toList());
//      OptionalInt f= Arrays.stream(a).max();
//      f.ifPresent(System.out::println);
//                Collections.sort(l);
//        System.out.println(l);
//        Collections.sort(l,Comparator.reverseOrder());
//        System.out.println(l);
//        e.stream().filter(x->x.getName().equalsIgnoreCase("anil")&& x.getAge()<50).collect(Collectors.toList()).forEach(System.out::println);
//
//      Map<Object, Long> p= e.stream().collect(Collectors.groupingBy(x->x.getName(),Collectors.counting()));
//System.out.println(p);
//      p.forEach((name, count) -> System.out.println(name + ": " + count));

//        OptionalInt q = Arrays.stream(a).reduce(x->x*x);
//        q.ifPresent(System.out::println);
        //        e.stream().map(x -> {
//            if (x.getAge() >= 70) {
//                x.setId(x.getId() + 1500);
//            }
//            return x;
//        }).collect(Collectors.toList()).forEach(System.out::println);
      int sum = e.stream().reduce(0,(x,y)->x+y.getAge(),Integer::sum);
      System.out.println(sum);

        e.stream().filter(r -> r.getAge() >= 70).map(emp->emp.getName().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

//    e.stream().filter(r->r.getAge()>=70).map(r->{
//        r.setId(r.getId()+15000);
//            return r;}).collect(Collectors.toList()).forEach(System.out::println);
//    }
    }
}