package cn.system.dao;

import cn.system.idao.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack(){
		System.out.println("MuteQuack");
	}

}
