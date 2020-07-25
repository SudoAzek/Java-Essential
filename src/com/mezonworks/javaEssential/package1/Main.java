package com.mezonworks.javaEssential.package1;

import com.mezonworks.javaEssential.package2.*;

public class Main extends Parent {
    public static void main(String[] args) {
        ExampleInPackage1 e1 = new ExampleInPackage1();
//        System.out.println(e1.name1); // Private
        System.out.println(e1.name2); // Package
        System.out.println(e1.name3); // Protected
        System.out.println(e1.name4); // Public

        ExampleInPackage2 e2 = new ExampleInPackage2();

//        System.out.println(e2.name1); // Private - 'name1' has private access in 'com.mezonworks.javaEssential.package2.ExampleInPackage2'
//        System.out.println(e2.name2); // Package -  'name2' is not public in 'com.mezonworks.javaEssential.package2.ExampleInPackage2'. Cannot be accessed from outside package
//        System.out.println(e2.name3); // Protected - 'name3' has protected access in 'com.mezonworks.javaEssential.package2.ExampleInPackage2'
        System.out.println(e2.name4); // Public

        Main p = new Main();
//        System.out.println(p.name1); // Private - 'name1' has private access in 'com.mezonworks.javaEssential.package2.Parent'
//        System.out.println(p.name2); // Package - 'name2' is not public in 'com.mezonworks.javaEssential.package2.Parent'. Cannot be accessed from outside package
        System.out.println(p.name3); // Protected
        System.out.println(p.name4); // Public
    }
}
