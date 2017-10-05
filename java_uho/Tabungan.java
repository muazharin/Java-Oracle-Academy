public class Tabungan 
{
	private int saldo=10000;
	public void setSaldo(int x)
	{
		if(x<=0){
			System.out.println("Saldo tidak boleh 0")
		}else if(x>=1000000){
			System.out.println("Terjadi pencucian uang")
		}else{
			saldo=x;
		}
	}
	
	public int getSaldo()
	{
		return saldo;
	}
}