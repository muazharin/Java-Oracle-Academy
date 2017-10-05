public class Mobill
{
	/** ini adalah data fields*/
	int roda;
	int mesin;
	int body;
	
	/** ini adalah konstraktor non-default*/
	Mobill()
	{
		this(4,1,1);
		/*"this" bisa digunakan untuk pemanggilan antar constructor*/
		/*tapi syaratnya :
			-hanya bisa digunakan 1 kali
			-harus baris paling atas*/
	}
	
	/** ini adalah konstraktor non-default*/
	Mobill(int roda, int mesin, int body)
	{
		this.roda=roda;
		this.mesin=mesin;
		this.body=body;
	}
	
	void maju()
	{
		System.out.println("Maju..");
	}
	
	void mundur()
	{
		System.out.println("Mundur..");
	}
	
	void belok()
	{
		System.out.println("Belok..");
	}
	
	void berhenti()
	{
		System.out.println("Berhenti..");
	}
}

//class ini biasa disebut library