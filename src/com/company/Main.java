package com.company;

import com.company.people.Author;
import com.company.people.Person;
import com.company.people.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	JAVA OOPS 2
//        OBJ vs CLASS - OBJ is a piece of data. Class is what type of data that is - int, string, boolean, array.

//        this is the instance of the object
//        Integer num = 4;

//        returns the class
//        num.getClass();

//        first way of creating an instance of object
        Person firstPerson = new Person();

//        second way
        Person secondPerson = new Person("John");

//        the last way
        Person thirdPerson = new Person("John", "Doe", "Austin", 54, 6, false);
//        thirdPerson.sayHello();

//        System.out.println(thirdPerson);
//        System.out.println(thirdPerson.birthday());
//        System.out.println(thirdPerson.birthYear(2021));

        Author newAuthor = new Author();
        newAuthor.setFirstName("Dan");

//        System.out.println(newAuthor.writingBook());

        ArrayList<Student> studentList = new ArrayList<Student>();

        Student s1 = new Student();
        s1.setFirstName("Sara");
        s1.setAge(19);
        s1.setGradYear(2025);
        studentList.add(s1); // adds to ArrayList right here

        Student s2 = new Student();
        s2.setFirstName("Ashley");
        s2.setAge(20);
        s2.setGradYear(2022);
        studentList.add(s2); // adds to ArrayList right here

        for (Student s : studentList) {
            System.out.println("Name: " + s.getFirstName() + "\nAge: " + s.getAge() + "\nGrad Year: " + s.getGradYear());
        }
    }
}
