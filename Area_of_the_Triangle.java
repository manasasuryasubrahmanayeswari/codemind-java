import java.util.Scanner;
public class triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=(a+b+c)/2;
        double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",Area);
    }
}