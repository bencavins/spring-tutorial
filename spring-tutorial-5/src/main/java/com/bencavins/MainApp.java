package com.bencavins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/bencavins/beans/beans.xml");

        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");

        person1.setTaxId(456789);

        System.out.println(person2);

        ((ClassPathXmlApplicationContext) context).close();
    }

}
