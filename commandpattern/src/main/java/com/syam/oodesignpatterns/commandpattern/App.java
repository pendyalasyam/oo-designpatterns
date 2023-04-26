package com.syam.oodesignpatterns.commandpattern;

import java.util.Scanner;

import com.syam.oodesignpatterns.commandpattern.devices.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplianceControl applianceControl = new ApplianceControl();
        CeilingFan ceilingFan = new CeilingFan();
        CeilingLight ceilingLight = new CeilingLight();
        GarageDoor garageDoor = new GarageDoor();
        GardenLight gardenLight = new GardenLight();
        HotTub hotTub = new HotTub();
        Sprinkler sprinkler = new Sprinkler();
        
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
        	
        	System.out.print("Enter slot:");
        	String slotStr = scanner.nextLine();
        	System.out.print("Enter button:");
        	String buttonStr = scanner.nextLine();
        	
        	int slot = Integer.parseInt(slotStr);
        	int button = Integer.parseInt(buttonStr);
        	
        	if(slot == 1)
        	{
        		if(button == 1)
        		{
        			ceilingFan.high();
        		}
        		else
        		{
        			ceilingFan.off();
        		}
        	}
        	else if(slot == 2)
        	{
        		if(button == 1)
        		{
        			ceilingLight.on();
        		}
        		else
        		{
        			ceilingLight.off();
        		}
        	}
        	else if(slot == 3)
        	{
        		if(button == 1)
        		{
        			garageDoor.up();
        		}
        		else
        		{
        			garageDoor.down();
        		}
        	}
        	else if(slot == 4)
        	{
        		if(button == 1)
        		{
        			gardenLight.manualOn();
        		}
        		else
        		{
        			gardenLight.manualOff();
        		}
        	}
        	else
        		break;
        }
        scanner.close();
    }
}
