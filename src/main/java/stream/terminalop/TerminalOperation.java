package stream.terminalop;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperation {
    private TerminalOperation(){};

    public static void forEach() {
        Stream<String> stringStream = Stream.of("One", "Two", "Three");
        stringStream.forEach(System.out::println);
    }

    public static void reduceMultiply() {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        Optional<Integer> reduce = integerStream.reduce((s1, s2) -> s1 * s2);

       // System.out.println(integerStream.count()); error

        Integer result = null;
        if (reduce.isPresent()) {
            result = reduce.get();
        }

        //System.out.println(integerStream.count());
        System.out.println(result);
    }


    public static void reduceSum() {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
        Optional<Integer> reduce = integerStream.reduce((s1, s2) -> s1 * s2);

        Integer result = null;
        if (reduce.isPresent()) {
            result = reduce.get();
        }
        System.out.println(result);
    }

    public static void sum() {
        IntStream integerStream = IntStream.of(1,2,3,4,5);
        int sum = integerStream.sum();
        System.out.println(sum);
    }

    public static void avg() {
        IntStream integerStream = IntStream.of(1,2,3,4,5);
        OptionalDouble average = integerStream.average();
        System.out.println(average);
    }

    public static void find(){
        Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> integerStream2 = Stream.of(1,2,3,4,5);

        Optional<Integer> any = integerStream1.findAny();
        Optional<Integer> first = integerStream2.findFirst();
    }

    public static void match() {
        Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> integerStream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> integerStream3 = Stream.of(1,2,3,4,5);

        boolean resultAnyMatch = integerStream1.anyMatch(n -> n > 4);
        boolean resultAllMatch = integerStream2.allMatch(n -> n > 4);
        boolean resultNoneMatch = integerStream3.noneMatch(n -> n > 10);

        System.out.println("ResultAnyMatch:  "+resultAnyMatch);
        System.out.println("ResultAllMatch:  "+resultAllMatch);
        System.out.println("ResultNoneMatch: "+resultNoneMatch);
    }

    public static void main(String[] args) {
//        forEach();
//        reduceMultiply();
//        match();
        sum();
        avg();
    }
}
