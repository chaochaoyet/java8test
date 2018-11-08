package com.iruka;

import java.time.LocalDateTime;
public class DateTest {

    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);
        System.out.println(currentTime.toLocalDate());
        System.out.println(currentTime.getMonth());
    }
}



