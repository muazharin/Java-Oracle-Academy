public class MyNewKeyboard
{
	public static void main(String [] d)
	{
		java.util.Scanner pembaca=new java.util.Scanner(System.in);
		
		System.out.print("Masukkan Nama Anda : ");
		String nama=pembaca.nextLine(); //.nextLine maksudnya akan terus menunggu sampai user menekan tombol enter
		
		System.out.print("Masukkan Alamat Anda : ");
		String alamat=pembaca.nextLine();
		
		System.out.print("Masukkan Umur Anda : ");
		String umur=pembaca.nextLine();
		
		System.out.println("=======DATA ANDA=======");
		System.out.println("NAMA	\t: "+nama);
		System.out.println("ALAMAT	\t: "+alamat);
		System.out.println("UMUR	\t: "+umur);
	}
}