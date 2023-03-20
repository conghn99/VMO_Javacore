package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,1,9,7,3,5,2,8);

        // Lớp vô danh (anonymous class)
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + "\t");
            }
        });
        System.out.println();

        // Sử dụng lambda
        list.forEach((n) -> System.out.print(n +"\t"));
        System.out.println();

        // Lớp vô danh
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        // Lambda
        list.sort((o1, o2) -> o2 - o1);

        list.forEach((n) -> System.out.print(n +"\t"));
        System.out.println();
    }
}
