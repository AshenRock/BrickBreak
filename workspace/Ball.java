/*
 * Author: Ian Volchok
 * Date: 12/10/24
 * Description: This is the Ball Class for the brickbreak game, creates the ball and defines it, allowing the game to run 
 * while this class can stand alone, it will not do anything
 */


import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:

	private int xVal;
	private int yVal;
	private int radius;
	private int xSpeed;
	private int ySpeed;

	//constructor(s):
	public Ball(int initxVal, int inityVal, int initRadius){
		xVal = initxVal;
		yVal = inityVal;
		radius = initRadius;
		xSpeed = 2;
		ySpeed = -2;
	}
	//methods:
	public void setX(int setXVal){
		xVal = setXVal;
	}
	public int getXpos(){
		return xVal;
	}
	public void setY(int setYVal){
		yVal = setYVal;
	}
	public int getYpos(){
		return yVal;
	}
	public int getSize(){
		return radius;
	}
	public void setXVelocity(int newXVelocity){
		xSpeed = newXVelocity;
	}
	public void setYVelocity(int newYVelocity){
		ySpeed = newYVelocity;
	}
	//precondition: xSpeed must be declared
	//postcondition: xSpeed is reversed, and ball goes other direction on the x axis
	public void reverseX(){
		xSpeed *= -1;
	}
	
	//precondition: ySpeed must be declared
	//postcondition: ySpeed is reversed, and ball goes other direction on the y axis
	public void reverseY(){
		ySpeed *= -1;
	}
	
	//precondition: Graphics are imported and g is declared, as well as xVal, yVal, and radius
	//postcondition: ball is drawn as an oval using 3 declared variables
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(xVal, yVal, radius, radius);


	}
	//precondition ball has been drawn, xVal and yVal and xSpeed and ySpeed have all been declared
	//postcondition ball moves on both x and y axis according to respective speed values
	public void move(){
		xVal += xSpeed;
		yVal += ySpeed;
	}

}
