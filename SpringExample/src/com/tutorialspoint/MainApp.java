/**
 *  MainApp.java
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ben
 *
 */
public class MainApp {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");;

	/*
	 * Example of the singleton scope
	 */
	private static void runSingletonExample()
	{
	    System.out.println("---------- runSingletonExample ----------\n");
		
	    SingletonScope objA = (SingletonScope) context.getBean("singletonScope");
		
		objA.setMessage("I'm a singleton object");
		objA.printMessage();
		
		SingletonScope objB = (SingletonScope) context.getBean("singletonScope");
		objB.printMessage();
		
		System.out.println("\n");
	}
	
	private static void runPrototypeExample() 
	{
	    System.out.println("---------- runPrototypeExample ----------\n");
	    
		PrototypeScope protoA = (PrototypeScope) context.getBean("prototypeScope");
		
		protoA.setMessage("I'm a prototype object");
		protoA.printMessage();
		
		PrototypeScope protoB = (PrototypeScope) context.getBean("prototypeScope");
		protoB.printMessage();
		
		System.out.println("\n");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		runSingletonExample();
		runPrototypeExample();
	}

}
