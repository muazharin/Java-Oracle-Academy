public class TestString
{
	public static void main(String [] a)
	{
		String kata1="Kendari Kota yang Indah";
		String kata2="Kendari ";
		String kata3="Kota ";
		String kata4="yang Indah";
		String kata5=kata2+kata3+kata4;
		
		System.out.println("Kata 1 : "+kata1);
		System.out.println("Kata 5 : "+kata5);
		System.out.println(kata1==kata5);			//hasilnya akan false karena tanda "==" hanya akurat pada type data primitive (int,float,double,etc)
		System.out.println(kata1.equals(kata5));	//hasilnya akan true karean tanda ".equals()" akurat untuk type data object
		
		
	}
}