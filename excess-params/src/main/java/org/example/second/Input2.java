package org.example.second;

/**
 * Implementation before refactoring.
 */
public class Input2 {

    public static class User {
        public static int TYPE_ENGINEER = 1;
        public static int TYPE_MANAGER = 2;

        private final String name;
        private final int age;
        private final int type;
        private final String phone;
        private final String phoneCode;

        public User(final String name, final int age, final int type, final String phone, final String phoneCode) {
            this.name = name;
            this.age = age;
            this.type = type;
            this.phone = phone;
            this.phoneCode = phoneCode;
        }

        public void printDetails(){
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Type: " + this.type);
            System.out.println("Phone: " + this.phoneCode + this.phone);
        }
    }









}
