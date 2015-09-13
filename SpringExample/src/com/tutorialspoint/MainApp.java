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
		objA.printMessage();
		
		SingletonScope objB = (SingletonScope) context.getBean("singletonScope");
		objB.printMessage();
		
		// Prototype Scope
		PrototypeScope protoA = (PrototypeScope) context.getBean("prototypeScope");
		
		protoA.setMessage("I'm a prototype object");
		protoA.printMessage();
		
		PrototypeScope protoB = (PrototypeScope) context.getBean("prototypeScope");
		protoB.printMessage();
		
	}

}
