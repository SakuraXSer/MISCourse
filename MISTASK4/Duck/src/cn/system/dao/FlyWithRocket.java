package cn.system.dao;

import cn.system.idao.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
	@Override
	public void fly(){
		System.out.println("Fly with Rocket!");
	}
}
