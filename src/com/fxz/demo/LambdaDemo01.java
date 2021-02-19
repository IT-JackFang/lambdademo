package com.fxz.demo;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-02-19 14:23:30
 */
public class LambdaDemo01 {

    public static void main(String[] args) {

        LambdaDemo01 tester = new LambdaDemo01();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不使用类型声明
        MathOperation subtraction = (a,b) -> a - b;

        // 有大括号和类型声明
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号和类型声明
        MathOperation division = (a,b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetingService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetingService2 = (message) ->
                System.out.println("Hello " + message);

        greetingService1.sayMessage("Android");
        greetingService2.sayMessage("Google");

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
