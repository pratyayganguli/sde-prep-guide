package com.interview.dp.recursion.examples;

import java.util.Random;

class ObjectRecursionExample {



}


class User {
    private final String id;

    User(String id) {
        this.id = id;
    }

    User getUser() {
        int id = new Random().nextInt(1000, 2000);
        return new User(String.valueOf(id));
    }
}