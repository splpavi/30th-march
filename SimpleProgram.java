public class Today 
{
	int k=5;
	public static void main (String args[]) 
	{
		
		Today a=new Today();
		doWork(a);
		System.out.println(a.k);
		
	}
	static Today doWork(Today newob)
	{
		newob.k=10;
		return new Today();
	}
}
