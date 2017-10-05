public class PesawatTempur extends Pesawat
{
	PesawatTempur()
	{
		super("qwe");
		System.out.println("Object Pesawat Tempur");
	}
	
	void manuver()
	{
		System.out.println("Manuver");
	}
	
	void terbang()
	{
		super.terbang();						//memanggil properti terbang() milik Pesawat
		System.out.println("Terbang Sendiri"); 	////memanggil properti terbang() milik PesawatTempur
	}
}