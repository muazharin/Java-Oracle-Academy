class Bonbin
{
	static void test(Binatang x)
	{
		x.makan();
		x.minum();
	}
	
	public static void main(String [] args)
	{
		Gajah elephant=new Gajah();
		Kerbau buffalo=new Kerbau();
		test(elephant);
		test(buffalo);
	}
}