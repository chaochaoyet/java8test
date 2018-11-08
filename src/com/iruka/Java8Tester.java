package com.iruka;

public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();
        // 包含类型声明
        MathOperation addition = (int a, int b) -> a + b;
        //没有类型声明
        MathOperation subtraction = (a, b) -> a - b;
        //包含返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;
        System.out.println("10 + 5 " + tester.operate(10, 5, addition));
        System.out.println("11 - 5 " + tester.operate(11, 5, subtraction));
        System.out.println("10 * 6 " + tester.operate(10, 6, multiplication));
        System.out.println("10 / 5 " + tester.operate(10, 5, division));
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
