package com.string.concat;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/*
    Name    : Monu KD (monukd01dev)
    Project : Basic
    Date    : 02-Oct-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Concat {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Jee";
        String add_result;
//       1. Using String concatenation (+) operator
        // what we do
        add_result = str+str1;
        // What JVM do
//        add_result = (new StringBuffer()).append(str).append(str1).toString();
        System.out.println(add_result);

//        2) String Concatenation by concat() method
        String str2 = "Cello";
        add_result = str.concat(str2);
        System.out.println(add_result);

//        3) String concatenation using format() method
        add_result = String.format("%s%s%s", str, str1, str2);
        System.out.println(add_result);

//        4) String concatenation using String.join() method (Java Version 8+)
        String str3 = "Kello";
        add_result = String.join("-", str, str3);
//        add_result = String.join(" ", str, str3);
        System.out.println(add_result);

//        5) String concatenation using StringJoiner class (Java Version 8+)
        StringJoiner s = new StringJoiner(", ");
        s.add(str);
        s.add(str1);
        System.out.println(s);

//        6) String concatenation using Collectors.joining() method (Java (Java Version 8+)
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array
        str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
        System.out.println(str.toString());  //Displays result
    }
}
