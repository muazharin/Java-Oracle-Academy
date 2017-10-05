class Dua
{
	Dua(String a)
	{
		System.out.println("Dua "+a);
	}
}

class Satu extends Dua
{
	Satu(String a)
	{
		super(a);
		System.out.println("Satu "+a);
	}
}

class Enam extends Satu
{
	Enam(String a)
	{
		super(a);
		System.out.println("Enam "+a);
	}
}

public class Test
{
	public static void main(String [] args)
	{
		Enam e=new Enam("qwe");
	}
}