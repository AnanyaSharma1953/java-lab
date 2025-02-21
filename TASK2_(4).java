import java.util.*;
public class b4
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
        StringBuffer sb = new StringBuffer(st);
         for (int i = 0; i < sb.length(); i++) 
         {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                sb.delete(i, i + 1);
                i--; 
            }
        }
        System.out.println(sb.toString());
    }
}

