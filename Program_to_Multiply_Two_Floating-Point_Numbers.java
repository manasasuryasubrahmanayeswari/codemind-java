import java.util.Scanner;
public class multiply 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=a*b;
        System.out.printf("%.2f",c);
    }
}