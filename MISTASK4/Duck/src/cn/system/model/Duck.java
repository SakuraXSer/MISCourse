package cn.system.model;

import cn.system.idao.*;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void swim(){
		System.out.println("Swim Free!");
	}
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flyBehavior.fly();
	}
	public void setQuackBehavior(QuackBehavior behavior) {
	      this.quackBehavior = behavior;
	}
	public void setFlyBehavior(FlyBehavior behavior) {
	      this.flyBehavior = behavior;
	}
}
