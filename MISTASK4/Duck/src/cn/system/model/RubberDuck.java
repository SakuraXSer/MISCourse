package cn.system.model;

import cn.system.dao.FlyNoWay;
import cn.system.dao.MuteQuack;

public class RubberDuck extends Duck {
	public RubberDuck(){
		setQuackBehavior(new MuteQuack());	
		setFlyBehavior(new FlyNoWay());		
	}
	@Override
	public void display(){
		System.out.println("I am RubberDuck.");
	}
}
