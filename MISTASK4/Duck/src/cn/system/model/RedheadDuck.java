package cn.system.model;

import cn.system.dao.Squeak;
import cn.system.dao.FlyWithRocket;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		setQuackBehavior(new Squeak());	
		setFlyBehavior(new FlyWithRocket());		
	}
	@Override
	public void display(){
		System.out.println("I am RedheadDuck.");
	}
}
