/**
 *  MainApp.java
 * 
 *  Hello world example from tutorialspoint.com
 *  http://www.tutorialspoint.com/spring/spring_hello_world_example.htm
 */
package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ben
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Context is never closed, resource leak
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Singleton Scope
		SingletonScope objA = (SingletonScope) context.getBean("singletonScope");
		
		objA.setMessage("I'm a singleton object");
		objA.getMessage();
		
		SingletonScope objB = (SingletonScope) context.getBean("singletonScope");
		objB.getMessage();
		
	}

}
