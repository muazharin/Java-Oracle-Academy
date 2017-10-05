public class MySwitch
{
	public static void main(String [] a)
	{
		char nilai='a';
		String predikat="";
		
		switch(nilai)
		{
			case 'a':
				predikat="excellent";
				break;
			case 'b':
				predikat="good";
				break;
			case 'c':
				predikat="fair";
				break;
			case 'd':
				predikat="dafug";
				break;
			case 'e':
				predikat="greget";
				break;
			default:
				predikat="no such grade";
				break;
		}
		System.out.println(predikat);
	}
}