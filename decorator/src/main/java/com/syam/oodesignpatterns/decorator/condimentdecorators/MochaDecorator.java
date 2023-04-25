package com.syam.oodesignpatterns.decorator.condimentdecorators;

import com.syam.oodesignpatterns.decorator.Bevarages.Bevarage;

public class MochaDecorator extends CondimentDecorator {

	public MochaDecorator(Bevarage bev) {
		super(bev);
	}

	public int cost() {
		
		return 1 + decoratedBevarage.cost() ;
	}

	public String description() {
		// TODO Auto-generated method stub
		return decoratedBevarage.description() + ",Mocha";
	}

}
