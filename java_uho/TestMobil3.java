public class TestMobil3
{
	public static void main(String [] args)
	{
		Mobill jazz=new Mobill(1,2,3);
		Mobill fortuner=new Mobill(4,5,6);
		Mobill chevrolet=new Mobill(7,8,9);
		/** ini adalah konstraktor non-default*/
		Mobill xenia=new Mobill();
		
		System.out.println("Roda jazz \t: "+jazz.roda);
		System.out.println("Roda fortuner \t: "+fortuner.roda);
		System.out.println("Roda chevrolet  : "+chevrolet.roda);
		System.out.println("Roda xenia \t: "+xenia.roda);
		
		System.out.println("Mesin jazz \t: "+jazz.mesin);
		System.out.println("Mesin fortuner \t: "+fortuner.mesin);
		System.out.println("Mesin chevrolet : "+chevrolet.mesin);
		System.out.println("Mesin xenia \t: "+xenia.mesin);
		
		System.out.println("Body jazz \t: "+jazz.body);
		System.out.println("Body fortuner \t: "+fortuner.body);
		System.out.println("Body chevrolet  : "+chevrolet.body);
		System.out.println("Body xenia \t: "+xenia.body);
		
		
		
	}
}