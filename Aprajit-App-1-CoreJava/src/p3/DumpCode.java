package p3;

public class DumpCode {

	Animal a = new Animal();
	public Animal doThings()
	{
		// state --- 100 
		
		// .., line 1000 line
		Animal a = new Animal();// 500
		
		return a;
	}
	
	public void activity()
	{
		Animal a = doThings(); // error 
		a.doEat(); // wrong value
		
	}
	
}
