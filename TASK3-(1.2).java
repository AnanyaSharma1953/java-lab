import java.util.*;
class Wordeg
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        int res[][]=new int[m][n];
        int c=0;
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++){
        	arr[i][j]=sc.nextInt();
        }}
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
        res[j][i]=arr[i][j];
        }
        }
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
        
        System.out.print(res[i][j]+" ");
        }
        System.out.println();}
        }
}
