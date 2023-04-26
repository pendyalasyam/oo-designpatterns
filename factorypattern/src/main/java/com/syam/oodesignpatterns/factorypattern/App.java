package com.syam.oodesignpatterns.factorypattern;

import java.util.List;
import java.util.Scanner;

import com.syam.oodesignpatterns.factorypattern.animals.Animal;
import com.syam.oodesignpatterns.factorypattern.animals.Cat;
import com.syam.oodesignpatterns.factorypattern.animals.Cow;
import com.syam.oodesignpatterns.factorypattern.animals.Dog;

/**
 * Hello world!
 *
 */
public class App 
{
	//Simple factory method pattern
	public static Animal getAnimal(String animalName)
	{
		if(animalName.compareTo("Cow") == 0)
			return new Cow();
		else if(animalName.compareTo("Dog") == 0)
			return new Dog();
		else if(animalName.compareTo("Cat") == 0)
			return new Cat();
		return null;
	}

    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	int i = 0;
    	while(i < 20)
    	{
    		
    		System.out.print("Enter Animal Name: ");
    		String animalName = scanner.nextLine();
    		Animal animal = getAnimal(animalName);
    		if(animal == null)
    		{
    			System.out.println("Our system currently doesnt support this animal");
    		}
    		else
    		{
    			animal.moveFromLeftToRightOfScreen();
    		}
    		i++;
    	}
    	
    	scanner.close();
    }
}
