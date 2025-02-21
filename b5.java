import java.util.*;
class b5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        int asc[]=new int[26];
        for(int i=0;i<asc.length;i++)
        {
        	int f=0;
        	char c=(char)(97+i);
        	for(int j=0;j<st.length();j++)
        	{
        	if(st.charAt(j)==c)
        	{
			f++;	
        	}
        	}
        	asc[i]=f;
        }
        for(int i=0;i<asc.length;i++)
        {
        if(asc[i]!=0)
       System.out.println((char)(97+i)+"   "+asc[i]);
        }
    }
}

