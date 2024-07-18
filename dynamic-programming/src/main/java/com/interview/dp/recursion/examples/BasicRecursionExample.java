package com.interview.dp.recursion.examples;


import java.time.LocalTime;

/**
 *
 * Recursion is the phenomena where the function/method calls itself.
 * In this example the method foo will call itself.
 */


class BasicRecursionExample {
    void foo() {
        try {
            System.out.println("Hi the time is ".concat(LocalTime.now().toString()));

            // making the thread sleep so that it does not give out stack overflow exception
            Thread.sleep(1000);
            foo();
        } catch (InterruptedException  e) {
            System.out.println("Failure,".concat(e.getMessage()));
        }
    }
}

class Main {
    public static void main(String[] args) {
        BasicRecursionExample basicRecursionExample = new BasicRecursionExample();
        basicRecursionExample.foo();
    }
}
