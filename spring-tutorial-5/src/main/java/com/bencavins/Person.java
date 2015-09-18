package com.bencavins;

public class Person
{
    private Integer id;
    private String name;

    private Address address;
    
    private int taxId;

    public Person()
    {

    }

    public Person(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void speak()
    {
        System.out.println("Hello, world, I'm a person!\n");
    }
    
    public void onCreate()
    {
        System.out.println("Person created: " + this);
    }
    
    public void onDestroy()
    {
        System.out.println("Person destroyed: " + this);
    }

    public void setTaxId(int taxId)
    {
        this.taxId = taxId;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Person [id=" + id + ", name=" + name + ", address=" + address + ", taxId=" + taxId + "]";
    }

}
