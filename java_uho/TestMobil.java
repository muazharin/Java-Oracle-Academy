//class ini biasa disebut driver
public class TestMobil
{
	public static void main(String [] y)
	{
		Mobil avanza=new Mobil();		//membuat object
		System.out.println("Jumlah roda : "+avanza.roda);
		System.out.println("Jumlah mesin : "+avanza.mesin);
		System.out.println("Jumlah body : "+avanza.body);
		
		avanza.maju();
		avanza.mundur();
		avanza.belok();
		avanza.berhenti();
	}
}

/*static merupakan class variabel dimana penggunaan memori objectnya ditempat yang sama
jadi jika variabel satu object diganti, maka variabel object yang lain akan ikut terganti*/