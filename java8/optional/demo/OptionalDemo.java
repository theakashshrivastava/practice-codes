package java8.optional.demo;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] s = {"AB","DE","FG","GH","IU","OP"};
        Optional<String> optStr = Optional.of(s[5]);
        System.out.println(optStr.get());
        optStr.ifPresent(s2-> System.out.println(s2.length()));
    }
}
