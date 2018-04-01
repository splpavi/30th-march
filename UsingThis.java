public class UsingThis 
{
int a=10;                     //Instance variable 
void get()
{
	int a=88;                   //Local variable with same Reference name that of Instance variable
	System.out.println("Welcome to pavi programer");
	System.out.println(a);  
	System.out.println(this.a);  //using this to invoke gloabal variable
}
public static void main(String[] args)
{
	UsingThis UT=new UsingThis();
	UT.get();
}
}


//OUTPUT:
//88
//10
