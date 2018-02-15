package com.parking;

public class UtilityClass {
	Car c = new Car();
	Car[] c1 =new Car[30];
public void parkCar(Car c)
{
	for(int i=0;i<c1.length;i++)
	{
		if(c1[i]==null)
		{
			c1[i]= c;
			break;
			//System.out.println("car parked"+c1[i].getBrand());
			
		}
	}
}
public int searchCar(int carno)
{
	int carPosition =-1;
	for(int i=0;i<c1.length;i++)
	{
		System.out.println(c1[i].getBrand());
		if(c1[i].getCarno()==carno)
		{
			carPosition =i;
			//System.out.println(carPosition+"car pos");
			//System.out.println(c1[i].getBrand());
			//System.out.println(c1[i].getCarno());
			//System.out.println(c1[i].getColour());
			
		}
		else{
			System.out.println("no car found");
		}
		
	}
	
	System.out.println(carPosition+"car pos");
	return carPosition;
}
public void viewCar(int carno)
{
	int j=searchCar(carno);
	System.out.println("view pos"+j);
	System.out.println(c1[j].getBrand());
	
}
public void deleteCar(int carno)
{
	int j=searchCar(carno);
	System.out.println("view pos in delete"+j);

}
public void updateCar(Car c)
{
	int j = searchCar(c.getCarno());
	for(int i=0;i<c1.length;i++)
	{
	if(c1[i]==null)
	{
		c1[i]= c;
		break;
	}
	
	}
	c1[j]=null;
}
}
		
