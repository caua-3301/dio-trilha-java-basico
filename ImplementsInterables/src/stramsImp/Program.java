package stramsImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Predicate<Integer> predicate = item -> item%2 == 0;

        Supplier<String> supplier = () -> "Hello, world";

        list.stream().filter(predicate).forEach(System.out::println);

        int a = list.stream().reduce(0, Integer::sum);

        list.stream().distinct().forEach(System.out::println);
    }

}
