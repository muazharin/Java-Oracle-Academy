import java.io.*;

class BacaFile
{
	public static void main(String [] a) throws Exception
	{
		if(a.length==0)
		{
			System.out.println("Cara Pakai : java BacaFile <namafile>");
		}else{
			File f=new File(a[0]);
			if(f.exists())
			{
				FileInputStream fis=new FileInputStream(f);
				int data=0;
				while((data=fis.read())!=-1)
				{
					System.out.print((char)data);
				}
			}else{
				System.out.println("File :"+a[0]+", tidak Ada..Jangan ngawur !!");
			}
		}
	}
}