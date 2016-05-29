package cn.system.model;

import cn.system.dao.FlyWithWings;
import cn.system.dao.Quack;

public class MallardDuck extends Duck {
	public MallardDuck(){
		setQuackBehavior(new Quack());	
		setFlyBehavior(new FlyWithWings());		
	}
	@Override
	public void display(){
		System.out.println("I am MallardDuck.");
	}
}
