public class Encapsule
{
int i,j;
String s[]={"learner","i am","java"};
String temp;
void beforesort()
{
	System.out.println("The words before sorting ");                                 //this is the method for default access modifier
	for(i=0;i<3;i++)
	System.out.println(s[i]);

}
protected void sortword()
{
	for(i=0;i<3;i++)
		for(j=0;j<2;j++)                                                               //this is the method for protected access modifier
		{
			if(s[j].compareTo(s[j+1])>0)
			{
				temp=s[j];                                                                          
				s[j]=s[j+1];
				s[j+1]=temp;
			}}}
public void simple()
{
	System.out.println("Doing Word sorting Program");                                //this is the method for public access modifier
	System.out.println();
	}
private void display()
{
	System.out.println("The words after sorting ");                                  //this is the method for private access modifier
	for(i=0;i<3;i++)
		System.out.println(s[i]);
	
}
		public static void main(String[] args)
		{
		Encapsule e=new Encapsule();
		e.simple();
		e.beforesort();
		e.sortword();
		e.display();

	}

}




//output:
//Doing Word sorting Program

//The words before sorting 
//learner
//i am
//java
//The words after sorting 
//i am
//java
//learner

