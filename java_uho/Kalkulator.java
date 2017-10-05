public class Kalkulator
{
	public static void main(String [] f)
	{
		java.util.Scanner pembaca=new java.util.Scanner(System.in);
		
		/*Cara Jadul
		System.out.print("Bil 1 : ");
		int bil1=Integer.parseInt(pembaca.nextLine());*/
		
		System.out.print("Bil 1 : ");
		int bil1=pembaca.nextInt();
		
		System.out.print("Bil 2 : ");
		int bil2=pembaca.nextInt();
		
		int hasil=bil1*bil2;
		System.out.print(bil1+" x "+bil2+" = "+hasil);
	}
}