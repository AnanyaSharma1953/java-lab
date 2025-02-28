import java.util.*;
class Wordeg
{
	private String substr;
	Wordeg(String s)
	{
	substr=s;
	}
	
	void count()
	{
		int c=0;
		String st="";
		substr+=" ";
		for(int i=0;i<substr.length();i++)
		{
			if(substr.charAt(i)==' ')
			{
				char c1=st.charAt(0);
				char c2=st.charAt(st.length()-1);
				if((c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')&&(c2=='A'||c2=='E'||c2=='I'||c2=='O'||c2=='U'))
				c++;
				st="";
			}
			else
			{st+=substr.charAt(i);
			}
		}
		System.out.println(c);
	}
	void place()
	{
	String s="",s1="";
	String st="";
	//substr+=" ";
		for(int i=0;i<substr.length();i++)
		{
			if(substr.charAt(i)==' ')
			{
				char c1=st.charAt(0);
				char c2=st.charAt(st.length()-1);
				if((c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')&&(c2=='A'||c2=='E'||c2=='I'||c2=='O'||c2=='U'))
					s=s+st+" ";
				else
				s1+=st+" ";
				st="";
			}
			else
			{
				st+=substr.charAt(i);
			}
		}
		System.out.println(s+s1);
	}
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s2=sc.nextLine();
        Wordeg obj=new Wordeg(s2);
        obj.count();
        obj.place();
        System.out.println();
    }
}
