public class MyMethod
{
	static void cetak(String a)
	{
		System.out.println(a);
	}
	
	static int kali(int bil1, int bil2)
	{
		int hasil=bil1*bil2;
		return hasil;
	}
	
	public static void main(String [] u)
	{
		cetak("aaa");
		int hasilKali=kali(9,8);
		System.out.println(hasilKali);
	}
}