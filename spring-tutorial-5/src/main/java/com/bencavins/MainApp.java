package com.bencavins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp
{

    public static void main(String[] args)
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
        
        Person person = (Person) context.getBean("person");
        person.speak(); 
        
        ((AbstractApplicationContext) context).close();
    }

}
