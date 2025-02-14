import java.util.*;
class mycl
{
	public static void main(String args[])
	{   
	Scanner sc=new Scanner(System.in);
	int ch;
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:
		int r,n;
		double p;
		p=sc.nextDouble();
		r=sc.nextInt();
		n=sc.nextInt();
		System.out.println(p*(1+(r/100))*n);
		break;

		case 2:
		int r1,n1;
		double p1;
		p1=sc.nextDouble();
		r1=sc.nextInt();
		n1=sc.nextInt();
		System.out.println(p1*n1+p1*n1*(n1+1)/2*r1/100*1/12);
		break;
		
		default:
		System.out.println("wrong option");
		
	}                                                                                      
}
}
