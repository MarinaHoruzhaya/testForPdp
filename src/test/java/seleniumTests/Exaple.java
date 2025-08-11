//package seleniumTests;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Exaple {
//    public static void main(String[] args) {
//        List<String> names = List.of("Marina", "Igor", "Artem");
//        List<String> surNames = List.of("Horuzhaya","Surname2");
//
//        List<String> result = Stream.concat(
//                names.stream().filter(name -> name.length() > 4),
//                surNames.stream().filter(surname -> surname.length() > 4)
//        ).collect(Collectors.toList());
//        System.out.println(result);
//
//        List<String> result2 = ((java.util.function.BiFunction<List<String>, List<String>, List<String>>) (n, s) ->
//                Stream.concat(
//                        n.stream().filter(name -> name.length() > 4),
//                        s.stream().filter(surname -> surname.length() > 4)
//                ).collect(Collectors.toList())
//        ).apply(names, surNames);
//
////collect, forEach, reduce, min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny, takeWhile
//        // flatMap, distinct, sorted, peek, limit, skip.
////примеры
//        List<List<String>> listOfLists = Arrays.asList(
//                Arrays.asList("Alice", "Marina"),
//                Arrays.asList("Anton", "Maksim")
//        );
//        List<String> flatList = listOfLists.stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList()); //Преобразует каждый элемент в поток и объединяет потоки.
//
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = numbers.stream()
//                .reduce(0, Integer::sum);
//
//
//        List<String> names1 = Arrays.asList("Alice", "Marina", "Katya");
//        boolean hasA = names.stream()
//                .anyMatch(name -> name.startsWith("A"));
//
//        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//
//        List<Integer> result3 = numbers2.stream()
//                .dropWhile(n -> n < 5)
//                .collect(Collectors.toList());
//
//
//        List<String> result4 = names.stream()
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//    }
//
//
//}
