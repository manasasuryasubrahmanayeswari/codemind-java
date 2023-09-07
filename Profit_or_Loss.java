import java.util.Scanner;
public class number
{
    public static void main(String args[])
    {
        int cp,sp;
        Scanner sc=new Scanner(System.in);
        cp=sc.nextInt();
        sp=sc.nextInt();
        if(cp < sp)
        {
            System.out.println("Profit");
        }
        else if(cp==sp)
        {
            System.out.println("No profit and No loss");   
        }
        else
        {
            System.out.println("Loss");
        }
    }
}