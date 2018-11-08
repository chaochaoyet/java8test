package com.iruka;

import java.util.Optional;
public class OptionalTest {

    public static void main(String[] args) {
        Integer nullNum = null;
        Integer num = 10;
        Integer opNullNum = Optional.ofNullable(nullNum).orElse(30);
        Integer opNum = Optional.of(num).orElse(40);
        System.out.println(opNullNum + opNum);
    }
}
