package -----
public abstract class Entity extends Actor{
	int speed = 2;
	public void act(){
		walk();
	}
	
	public void walk(){
		if(Greenfoot.isKeyDown("left")){
			setLocation(getX()-speed, getY());
		}
		if(Greenfoot.isKeyDown("right")){
			setLocation(getX()+speed, getY());
		}
		if(Greenfoot.isKeyDown("up")){
			setLocation(getX(), getY()-speed);
		}
		if(Greenfoot.isKeyDown("down")){
			setLocation(getX(), getY()+speed);
		}
	}
}