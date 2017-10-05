public class AksesData
{
	public static void main(String []args)
	{
		Database db=new MSSQLDriver();
		db.konek();
		db.diskonek();
	}
}