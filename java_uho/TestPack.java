import id.ac.uho.lib.*;
import id.ac.uho.*;		//.* hanya bisa memanngil file .class bukan folder atau file lain
public class TestPack
{
	public static void main(java.lang.String [] o) //ditulis lengkap dengan librarynya karena ada class yang bernamakan "String" difolder/directory yang sama
	{
		id.ac.uho.lib.MyLibrary ml=new id.ac.uho.lib.MyLibrary();	//ditulis lengkap dengan librarynya karena ada class yang bernamakan "MyLibrary" difolder/directory yang sama
		ml.cetak();
		LibLagi lib=new LibLagi();
		lib.cetakLagi();
	}
}