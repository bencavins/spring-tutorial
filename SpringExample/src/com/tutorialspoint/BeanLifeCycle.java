package com.tutorialspoint;

public class BeanLifeCycle
{

    public void init()
    {
        System.out.println("Creating Bean!");
    }
    
    public void destroy()
    {
        System.out.println("Destroying Bean!");
    }
}
