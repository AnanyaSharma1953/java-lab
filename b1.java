import java.util.*;
class b1
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
        int max=0,max2=0;
        for(int i=0;i<n;i++)
        {
        	if(a[i]>max)
        	max=a[i];
        }
        for(int i=0;i<n;i++)
        {
        if(a[i]<max && a[i]>max2)
        max2=a[i];
        }
        System.out.println(max2);
    }
}

