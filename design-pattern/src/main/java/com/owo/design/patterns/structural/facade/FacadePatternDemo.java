package com.owo.design.patterns.structural.facade;

public class FacadePatternDemo {


    public static void main() {
        final Programmer p = new Programmer();
        p.setName("owen");
        p.setGender("male");
        p.setAge(30);
        p.setLanguageGoodAt("c++,java");
        p.setType("android");
        Client c = new Client();
        c.process(new Person() {
            @Override
            public String name() {
                return p.getName();
            }

            @Override
            public String gender() {
                return p.getGender();
            }

            @Override
            public int age() {
                return p.getAge();
            }
        });
    }
}