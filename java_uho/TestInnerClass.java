public class TestInnerClass
{
	public MyIface getMyIface()
	{
		return new MyIface(){
			public void cetak()
			{
				System.out.println("Cetak");
			}
		};
	}
}