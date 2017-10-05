public class MyKeyBoard
{
	public static void main(String [] d)
	{
		//saat meng-execute caranya harus "java MyKeyBoard <argumen> "
		if(d.length==0){
			System.out.println("Anda tidak memasukkan argumen");
		}else{
			System.out.println("Argumen Anda : ");
			for(int i=0;i<d.length;i++)
			{
				System.out.println(d[i]);
			}
		}
	}
}

/*Note: <argumen> berarti boleh diisi sembarang*/