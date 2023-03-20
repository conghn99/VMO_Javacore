package lambda;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ngoc", 25));
        list.add(new Person("Hoang", 30));
        list.add(new Person("Tuan", 27));
        list.add(new Person("Hoa", 20));

        //Sử dụng lambda
        list.forEach(n -> System.out.println(n));

        //Sử dụng method reference
        list.forEach(System.out::println);
    }
}
