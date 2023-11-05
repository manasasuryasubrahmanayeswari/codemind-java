import java.util.*;
public class weird
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("not weird");
        }
        else
        {
            System.out.println("weird");
        }
    }
}