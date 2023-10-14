import java.util.Scanner;
public class triangle
{
    public static void main(String[] args)
    {
        double s,area;
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        s=((a+b+c)/2);
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}