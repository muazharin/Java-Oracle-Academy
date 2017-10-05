public class Test2
{
	public static void main(String [] o)
	{
		TestInnerClass t=new TestInnerClass();
		MyIface m=t.getMyIface();
		m.cetak();
	}
}