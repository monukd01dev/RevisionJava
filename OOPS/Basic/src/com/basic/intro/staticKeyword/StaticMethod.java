package com.basic.intro.staticKeyword;

public class StaticMethod {

    static String cmp_name;

    static void setCmp_name(String name) {
        cmp_name=name;
    }

    static String getCmp_name() {
        return cmp_name;
    }

    @Override
    public String toString() {
        return "StaticMethod{" +
                "cmp_name='" + cmp_name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        setCmp_name("LogicMethods");
        System.out.println(new StaticMethod());
    }
}
