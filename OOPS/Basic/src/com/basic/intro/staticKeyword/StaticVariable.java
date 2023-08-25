package com.basic.intro.staticKeyword;

public class StaticVariable {
    static String clg_name = "GITM";
    String name ;
    String course;

    public static String getClg_name() {
        return clg_name;
    }

    public static void setClg_name(String clg_name) {
        StaticVariable.clg_name = clg_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StaticVariable{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +", college='" + clg_name + '\'' +
                '}';
    }

    public StaticVariable(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public StaticVariable() {
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable(),s2 = new StaticVariable("Lalit Gupta","AIDS");
        s1.setCourse("CSE");
        s1.setName("Monu KD");
        setClg_name("DTU");
        System.out.println(s1);

        System.out.println(s2);


    }
}
