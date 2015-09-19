package com.bencavins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/bencavins/beans.xml");
        
        FruitBasket basket = (FruitBasket) context.getBean("fruitbasket");
        
        System.out.println(basket);
        
        ((AbstractApplicationContext) context).close();
    }

}
