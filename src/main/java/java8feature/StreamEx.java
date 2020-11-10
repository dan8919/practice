package java8feature;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(8);
        integers.add(10);

//        Stream<Integer> stream = Stream.of(integers);
//        System.out.println(stream);

//    try(Stream st = Files.lines(Paths.get("file"))){
//        st.forEach(system.out::println);
//    }


    Stream<Integer> s = Stream.of(1,2,3);
    Stream<String> stringStream = Stream.of("asdfgfgg","sdf","gf","qw");
    stringStream.forEach(System.out::println);

        long l=s.count();
        System.out.println(l);

       int sum = Stream.iterate(1,i->i+1)
                .filter(i ->i%2 ==1)
                .limit(5)
               .mapToInt(Integer::intValue)
               .sum();

        System.out.println(sum);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        //랜덤으로 찾은 숫자 5개 출력
        Stream.generate(() -> new Dragon());
        Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


    }
}
