package com.syam.oodesignpatterns.decorator.condimentdecorators;

import com.syam.oodesignpatterns.decorator.Bevarages.Bevarage;

public class SoyDecorator extends CondimentDecorator {

	public SoyDecorator(Bevarage bev) {
		super(bev);
	}

	public int cost() {
		
		return 3 + decoratedBevarage.cost() ;
	}

	public String description() {
		// TODO Auto-generated method stub
		return decoratedBevarage.description() + ",Soy";
	}

}
