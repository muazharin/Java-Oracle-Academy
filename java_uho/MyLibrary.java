public class MyLibrary
{
	void satu()
	{
		
	}
	
	void dua()
	{
		satu(); //access dari dalam satu class
	}
}
class Turunan extends MyLibrary
{
	void tiga()
	{
		dua();	//access dari turunan
	}
}