import java.util.*;
class b
{
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        	a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
        	int f=0;
        	for(int j=i;j<n;j++)
        	{
        	if(a[i]==a[j])
        	f++;
        	}
        	System.out.println(a[i]+"   "+f);
        	if(f>0)
        	i=i+f-1;
        }
    }
}

