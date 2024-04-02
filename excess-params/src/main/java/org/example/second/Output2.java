package org.example.second;

import org.example.first.Output1;

public class Output2 {

    public static abstract class User {
        private final String name;
        private final int age;
        private final PhoneData phone;

        public User(final String name, final int age, final PhoneData phone) {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }

        public void printDetails() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Type: " + this.getType());
            System.out.println("Phone: " + phone.getPhone());
        }

        public abstract int getType();
    }

    public static class Engineer extends User {

        public Engineer(final String name, final int age, final PhoneData phone) {
            super(name, age, phone);
        }

        @Override
        public int getType() {
            return 1;
        }
    }

    public static class Manager extends User {

        public Manager(final String name, final int age, final PhoneData phone) {
            super(name, age, phone);
        }

        @Override
        public int getType() {
            return 2;
        }
    }

    interface PhoneData {
        String getPhone();
    }

    public static class Phone implements PhoneData {
        private final String phone;
        private final String phoneCode;

        public Phone(final String phone, final String phoneCode) {
            this.phone = phone;
            this.phoneCode = phoneCode;
        }

        @Override
        public String getPhone() {
            return this.phoneCode + this.phone;
        }
    }
}
