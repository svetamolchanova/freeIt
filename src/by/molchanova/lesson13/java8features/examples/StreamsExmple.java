package by.molchanova.lesson13.java8features.examples;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamsExmple {
    public static void main(String[] args) {
//        List<UserNew> stringList = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            UserNew user = new UserNew();
//            user.setName("string " + new Random().nextInt(100));
//            stringList.add(user);
//        }
//
//        System.out.println(stringList);
//        System.out.println("+++++++++++++++++++");
//
//        List<String> userNames = new ArrayList<>();
//
//        for (UserNew user : stringList) {
//            userNames.add(user.getName());
//        }
//
//        Stream<UserNew> stream = stringList.stream();
//
//        List<String> list = stream.map(UserNew::getName).collect(Collectors.toList());
//
//        //Optional<UserNew> user = stream.findAny();
//
//        stringList.stream().peek(u -> u.setName(u.getName() + "1")).forEach(s -> System.out.println(s.getName()));
//
//        stringList.forEach(s -> System.out.println(s));
//
//        System.out.println(stringList);
//        System.out.println("+++++++++++++++");
//       // System.out.println(users);


        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            stringList.add("String " + new Random().nextInt(100));
        }
//
//        System.out.println(stringList.stream().map(s -> s.toLowerCase()).count());
//        System.out.println(stringList.stream().flatMap(s -> Stream.of(
//                s.toLowerCase(),
//                s.toUpperCase())).count());
//
//
//        long start = System.currentTimeMillis();
//        Set<String> stringSet = stringList.stream().filter((s) -> s.contains("1")).map((s) -> s.toUpperCase()).collect(Collectors.toSet());
//        System.out.println(System.currentTimeMillis() - start);
//
//        long start2 = System.currentTimeMillis();
//        Set<String> stringSet2 = stringList.parallelStream().filter((s) -> s.contains("1")).map((s) -> s.toUpperCase()).collect(Collectors.toSet());
//        System.out.println(System.currentTimeMillis() - start2);

        List<Integer> lists = Stream.of(1,2,3,4,4,5,1).distinct().collect(Collectors.toList());
        System.out.println(lists);

        Optional<Integer> result = Stream.of(1,2,3,4,4,5,1).reduce((x,y) -> x+y);
        System.out.println(result.get());
    }
}
