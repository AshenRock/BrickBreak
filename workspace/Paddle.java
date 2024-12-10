import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int xval;
	private int yval;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle(int inxVal, int inYval, int initWidth, int initHeight){
		xval = inxVal;
		yval = inYval;
		width = initWidth;
		height = initHeight;
		velocity = 0;
	}
	//methods:
	public int getVelocity() {
		return velocity;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getX() {
		return xval;
	}
	public int getY() {
		return yval;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setX(int xval) {
		this.xval = xval;
	}
	public void setY(int yval) {
		this.yval = yval;
	}
	public void addVelocity(int velocity){
		this.velocity += velocity;
	}
	//precondition: Graphics are imported and g is declared, as well as xval, yval, width, and height
	//postcondition: Paddle is drawn as a rectangle using 4 declared variables
	public void draw(Graphics g){
		g.fillRect(xval, yval, width, height);
	}
	//precondition paddle is drawn, xval and velocity have been properly declared
	//postcondition: paddle moves based on velocity
	public void move(){
		xval += velocity;
		velocity /= 2;
	}
}
