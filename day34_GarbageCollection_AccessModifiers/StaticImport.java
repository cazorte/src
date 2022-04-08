package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {


        System.out.println(pi);


        int x = 0;

        Dog dog1  = new Dog();
        dog1.name = "Lucy";

        dog1 =  new Dog();

        System.out.println(dog1);


        System.out.println("-------------");

        String str1 = new String();
        String str2 = new String();
        str1 = "java";
        str2 = "java";
              str1 =  str2;

        System.out.println(str1 == str2);

        str1 ="asd";
        System.out.println(str2);
        System.out.println(str1);

        System.out.println(str1 == str2);


    }

}