package com.parking;

import org.testng.annotations.Test;

public class TestingNg extends UtilityClass{
	Car c = new Car();

@Test(priority=1)
public void parkTheCar()
{
	c.setBrand("benz");
	c.setCarno(678);
	c.setColour("blue");
  parkCar(c);
	
}
@Test(priority=2)
public void viewCar()
{
	int j=searchCar(678);
	System.out.println(j);
}
@Test(enabled=false)
public void updaCar()
{

	Car c1 = new Car();
	c1.setBrand("benz");
	c1.setCarno(678);
	c1.setColour("blue");
	updateCar(c1);
}
@Test(enabled=false)
public void deCar()
{
	deleteCar(678);
}
}
