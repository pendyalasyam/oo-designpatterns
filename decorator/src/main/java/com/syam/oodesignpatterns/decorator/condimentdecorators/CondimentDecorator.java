package com.syam.oodesignpatterns.decorator.condimentdecorators;

import com.syam.oodesignpatterns.decorator.Bevarages.Bevarage;

public abstract class  CondimentDecorator extends Bevarage {
	protected Bevarage decoratedBevarage;
	
	CondimentDecorator(Bevarage bev)
	{
		this.decoratedBevarage = bev;
	}
	
	public abstract int cost();

	public abstract String description();

}
