public class MyArray
{
	public static void main(String [] e)
	{
		//cara 1
		String [] kota={"Kendari","Makassar","Palu"};
		
		/*cara 2
		String [] kota
		kota=new String[]{"Kendari","Makassar","Palu"};
		
		cara 3
		String [] kota=new String[3];
		kota[0]="Kendari";
		kota[1]="Makassar";
		kota[2]="Palu";
		*/
		
		int jumlahElement=kota.length;
		System.out.println("Elemen : "+jumlahElement);
		
		for(int i=0;i<jumlahElement;i++)
		{
			System.out.println(kota[i]);
		}
	}
}