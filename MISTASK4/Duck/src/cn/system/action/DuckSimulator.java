package cn.system.action;

import java.util.Scanner;
import cn.system.model.Duck;
import cn.system.model.MallardDuck;
import cn.system.model.RedheadDuck;
import cn.system.model.RubberDuck;

public class DuckSimulator {
	private static Scanner d;

	public static void main(String[] args){
		System.out.println("Which one do you want to know more?");
		d = new Scanner(System.in);
		String duck = d.next();
		d.close();
		
		if(duck.equals("MallardDuck")){
			System.out.println("========MallardDuck=========");
			Duck mallardDuck = new MallardDuck();
			mallardDuck.display();
			mallardDuck.swim();
			mallardDuck.performFly();
			mallardDuck.performQuack();
		}
		if(duck.equals("RedheadDuck")){
			System.out.println("========RedheadDuck=========");
			Duck redheadDuck = new RedheadDuck();
			redheadDuck.display();
			redheadDuck.swim();
			redheadDuck.performFly();
			redheadDuck.performQuack();
		}
		if(duck.equals("RubberDuck")){
			System.out.println("========RubberDuck=========");
			Duck rubberDuck = new RubberDuck();
			rubberDuck.display();
			rubberDuck.swim();
			rubberDuck.performFly();
			rubberDuck.performQuack();
		}
	}
}
