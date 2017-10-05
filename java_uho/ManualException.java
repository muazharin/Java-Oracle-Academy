public class ManualException
{
	static void bagi(int pembilang, int penyebut) throws Exception
	{
		if(penyebut==0)
		{
			throw new Exception("Penyebut tidak boleh 0");
		}else{
			int hasil=pembilang/penyebut;
			System.out.println(hasil);
		}
	}
	
	public static void main(String [] a)
	{
		try{
			bagi(10,2);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}