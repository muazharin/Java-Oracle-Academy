import java.io.*;

class CopyFile
{
	public static void main(String [] a) throws Exception
	{
		if(a.length<2)
		{
			System.out.println("Cara Pakai : java CopyFile <sumber> <tujuan>");
		}else{
			File sumber=new File(a[0]);
			File tujuan=new File(a[1]);
			
			if(sumber.exists())
			{
				FileInputStream fis=new FileInputStream(sumber);
				FileOutputStream fos=new FileOutputStream(tujuan);
				int data=0;
				while((data=fis.read())!=-1)
				{
					fos.write(data);
				}
				fos.flush();
				fos.close();
				fis.close();
			}else{
				System.out.println("File "+a[0]+",tidak ditemukan");
			}
		}
	}
}