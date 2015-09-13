/**
 * SingletonScope.java
 * 
 * To demonstrate the singleton scope functionality for beans
 * 
 * Use singleton scope for state-less beans.
 * 
 * http://www.tutorialspoint.com/spring/spring_bean_scopes.htm
 */
package com.tutorialspoint;

/**
 * @author ben
 *
 */
public class SingletonScope {
	
	private String message;
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public void printMessage()
	{
		System.out.println(this.message);
	}
	
}
