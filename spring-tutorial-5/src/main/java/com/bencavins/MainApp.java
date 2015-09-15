package com.bencavins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/bencavins/beans/beans.xml");
        
        Person person = (Person) context.getBean("person");
        person.speak(); 
        
        ((ClassPathXmlApplicationContext) context).close();
    }

}
