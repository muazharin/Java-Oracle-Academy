public class Car
{
	Door pintu;
	Car()
	{
		pintu=new Door();
	}
	
	void startEngine()
	{
		System.out.println("engine start");
	}
	
	void stopEngine()
	{
		System.out.println("engine stop");
	}
}