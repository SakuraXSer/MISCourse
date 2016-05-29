package cn.system.dao;

import cn.system.idao.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly(){
		System.out.println("Can't fly!");
	}
}
