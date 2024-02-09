import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            List<Integer> intList = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                intList.add(i);
            }
            intList.add(3);
            List<String> strings = new ArrayList<>();
            strings.add("hello");
            strings.add("world");
            strings.add("aaa");
            System.out.println(getAverage(intList));
            System.out.println(transformToUpperCaseWithPrefix(strings));
            System.out.println(uniqueSquared(intList));
            System.out.println(transformTOUpperCaseWithSort(strings, 'w'));
            System.out.println(returnLastElem(intList));
            System.out.println(getIntSumOrZero(intList));
            System.out.println(convertToMap(strings));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double getAverage(List<Integer> numbers) {
        long count = (long) numbers.size();
        return numbers.stream().mapToDouble(x -> (double) x / count).reduce(0, Double::sum);
    }

    public static String transformToUpperCaseWithPrefix(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.joining(" ", "_new_", ""));
    }

    public static List<Integer> uniqueSquared(List<Integer> numbers) {
        return numbers.stream().filter(x -> Collections.frequency(numbers, x) == 1).map(x -> x * x).collect(Collectors.toList());
    }

    public static List<String> transformTOUpperCaseWithSort(List<String> strings, char letter) {
        return strings.stream().filter(x -> x.startsWith(String.valueOf(letter))).sorted().collect(Collectors.toList());
    }

    public static <T> T returnLastElem(List<T> strings) throws Exception {
        return strings.stream().reduce((first, second) -> second).orElseThrow(Exception::new);
    }

    public static Integer getIntSumOrZero(List<Integer> elements) {
        return elements.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
    }

    public static Map<Character, String> convertToMap(List<String> strings) {
        return strings.stream().collect(Collectors.toMap(x -> x.charAt(0), x -> x.substring(1)));
    }
}
