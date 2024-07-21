package com.interview.javaconcepts.version.java21;

/**
 * @author pratyayganguli
 */

class EvolvedSwitchStatements {

    static class User {
        private Integer id;
        private String name;
        private Boolean adult;

        public User(Integer id, String name, Boolean adult) {
            this.id = id;
            this.name = name;
            this.adult = adult;
        }
    }

    public static void main(String[] args) {
        User user = new User(1001, "Alex", true);

        Object id = user.id;
        Object name = user.name;
        Object adult = user.adult;

        // we can use rest of the data members to write alternative switch statements.

        switch (id) {
            case String v1 -> System.out.println("The type is string");
            case Integer v2 -> System.out.println("The type is integer");
            default -> System.out.println("could not detect object type");
        }
    }
}
