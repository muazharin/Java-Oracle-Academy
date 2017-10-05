public class TestMobil2
{
	public static void main(String [] y)
	{
		Mobil avanza=new Mobil();		//membuat object
		Mobil innova=new Mobil();		//membuat object
		System.out.println("Jumlah roda avanza : "+avanza.roda);
		System.out.println("Jumlah roda innova : "+innova.roda);
		avanza.roda=3;		//karena bukan static maka varibelnya besifat object variabel
		System.out.println("Jumlah roda avanza : "+avanza.roda);
		System.out.println("Jumlah roda innova : "+innova.roda);
		
		System.out.println("Jumlah roda innova : "+innova.mesin);
		avanza.mesin=5;		//karena merupakan static maka variabelnya besifat class variabel dan bisa diubah menjadi "Mobil.mesin=5;"
		System.out.println("Jumlah roda avanza : "+avanza.mesin);
		
		Mobil.maju(); 		//menjadi method variabel
		
		avanza.maju();
		avanza.mundur();
		avanza.belok();
		avanza.berhenti();
	}
}