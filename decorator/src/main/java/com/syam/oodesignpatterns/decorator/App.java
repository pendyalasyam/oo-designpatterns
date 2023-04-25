package com.syam.oodesignpatterns.decorator;

import com.syam.oodesignpatterns.decorator.Bevarages.Bevarage;
import com.syam.oodesignpatterns.decorator.Bevarages.DarkRoast;
import com.syam.oodesignpatterns.decorator.condimentdecorators.MochaDecorator;
import com.syam.oodesignpatterns.decorator.condimentdecorators.SoyDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Bevarage myBev = new SoyDecorator(new MochaDecorator(new DarkRoast()));
        
        System.out.println(myBev.description() + " : " +myBev.cost());
    }
}
