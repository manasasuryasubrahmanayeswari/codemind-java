import java.util.Scanner;
public class num
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=(a+b)/2.0;
        System.out.printf("%.4f",c);
    }
}