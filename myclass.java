import java.util.*;
class myclass
{
	public static void main(String args[])
	{   
	Scanner sc=new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int s1=0,s2=0;
	for(int i=1;i<a;i++)
	{
	if(a%i==0)
	s1+=i;
	}     
	for(int i=1;i<b;i++)
	{
	if(b%i==0)
	s2+=i;
	}        
	if(s1==a&&s2==b)
	System.out.print("friendly");
	else
	System.out.print("no...");                                                                         
}
}
