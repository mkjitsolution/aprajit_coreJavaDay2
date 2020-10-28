package p3;

public class Animal {

	int point = 100;
	public void doEat()
	{
		System.out.println(" Animals Eat Food");
	}
	public int getPoint()
	{
		return point;
	}
}

class Dog extends Animal
{
	public void doEat()
	{ // 1000 lines of code
		point++; // 101
		System.out.println("dog eats biscuits ...");
	}
	public void playGames()
	{
		point+=100;
		System.out.println("Dog playes Game");
		
	}
}

class Cow extends Animal
{
	public void doEat()
	{ // 1000 lines of code
		point++;
		System.out.println("Cow eats Grass ...");
	}
	public void cowWork()
	{
		point+= 200;
		System.out.println("cow Works called...");
		
	}
}
