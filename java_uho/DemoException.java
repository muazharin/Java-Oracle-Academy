public class DemoException
{
	public static void main(String [] a)
	{
		try
		{
			int [] angka={5,6};
			System.out.println(angka[6]);
			
			int hasil=10/0;
			System.out.println("Tidak Ada Error \nHasilnya adalah");
			System.out.println(hasil);
		}catch(ArrayIndexOutOfBoundsException ar){
			System.out.println("Ada Error di Array ");
		}catch(ArithmeticException am){
			System.out.println("Ada Error di Aritmatika ");
		}catch(Exception ex){
			System.out.println("Ada Error sebab ");
			ex.printStackTrace();
		}finally{
			System.out.println("Block finally running");
		}
	}
}