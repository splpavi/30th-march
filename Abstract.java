public abstract class Today {
	int s[]= {5,20,8,9};
	int i,j,temp,k;
	void sortin()
	{
		for(i=0;i<4;i++)
		{
				for(j=0;j<3;j++)
				{
					if(s[j]>s[j+1])
					{temp=s[j];
						s[j]=s[j+1];
						s[j+1]=temp;}
				}
			}
		}
		
	void displaya()
	{
		for(k=0;k<4;k++)
		{
					System.out.println(s[k]);
				}
		
	}
}
public class Morning extends Today
{
	public static void main (String args[]) 
	{
		Morning a=new Morning();
		a.sortin();
		a.displaya();
		
			
		
	}
}
