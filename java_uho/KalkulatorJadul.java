public class KalkulatorJadul
{
	public static void main(String [] f)
	{
		if(f.length==0)
		{
			System.out.println("Cara Pakai : java KalkulatorJadul bil1 bil2");
		}else{
			int bil1=Integer.parseInt(f[0]);
			int bil2=Integer.parseInt(f[1]);
			
			int hasil=bil1*bil2;
			System.out.print(bil1+" x "+bil2+" = "+hasil);
		}
	}
}