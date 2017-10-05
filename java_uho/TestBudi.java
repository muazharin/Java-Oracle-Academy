public class TestBudi
{
	static void testManusia(Manusia m)
	{
		m.bernafas();
	}
	
	static void testDosen(Dosen d)
	{
		d.mengajar();
	}
	
	static void testSniper(Sniper s)
	{
		s.menembak();
	}
	
	public static void main(String [] args)
	{
		Budi b=new Budi();
		testManusia(b);
		testDosen(b);
		testSniper(b);
	}
}













