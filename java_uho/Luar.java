class Luar
{
	void cetakLuar()
	{
		System.out.println("Cetak Luar");
	}
	class Tengah
	{
		void cetakTengah()
		{
			cetakLuar();
			System.out.println("Cetak Tengah");
		}
		class Dalam
		{
			void cetakDalam()
			{
				cetakLuar();
				cetakTengah();
				System.out.println("Cetak Dalam");
			}
		}
	}
}