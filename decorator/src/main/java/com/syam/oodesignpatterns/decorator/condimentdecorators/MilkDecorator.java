package com.syam.oodesignpatterns.decorator.condimentdecorators;

import com.syam.oodesignpatterns.decorator.Bevarages.Bevarage;

public class MilkDecorator extends CondimentDecorator {

	MilkDecorator(Bevarage bev) {
		super(bev);
	}

	public int cost() {
		
		return 2 + decoratedBevarage.cost() ;
	}

	public String description() {
		// TODO Auto-generated method stub
		return decoratedBevarage.description() + ",Milk";
	}

}
