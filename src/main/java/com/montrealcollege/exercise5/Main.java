package com.montrealcollege.exercise5;

import com.montrealcollege.exercise5.entities.College;
import com.montrealcollege.exercise5.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

        Student st1 = context.getBean("student1", Student.class);
        Student st2 = context.getBean("student2", Student.class);
        Student st3 = context.getBean("student3", Student.class);

        College col = context.getBean("mcit", College.class);

        System.out.println(col);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
