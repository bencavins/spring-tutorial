/**
 * HelloWorld.java
 * 
 * Hello world example from tutorialspoint.com
 * http://www.tutorialspoint.com/spring/spring_hello_world_example.htm
 */
package com.tutorialspoint;

/**
 * @author ben
 *
 */
public class HelloWorld {
	
	private String message;
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public void getMessage()
	{
		System.out.println("Your message = " + this.message);
	}
	
}
