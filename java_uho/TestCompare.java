public class TestCompare
{
	public static void main(String [] args)
	{
		Pesawat boeing=new Pesawat();
		Pesawat airbus=new Pesawat();
		System.out.println(boeing==airbus);
		System.out.println(boeing.equals(airbus));
		System.out.println(boeing);
		System.out.println(airbus);
		
	}
}