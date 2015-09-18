package com.bencavins;

public class PersonFactory
{
    public Person createPerson(Integer id, String name)
    {
        System.out.println("Using factory to create Person...");
        return new Person(id, name);
    }
}
