public class Door
{
	Window jendela;
	Door()
	{
		jendela = new Window();
	}
	
	void bukaPintu()
	{
		System.out.println("buka pintu");
	}
	
	void tutupPintu()
	{
		System.out.println("tutup pintu");
	}
}