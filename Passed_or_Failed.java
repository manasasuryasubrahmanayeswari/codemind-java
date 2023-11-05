import java.util.Scanner;
public class marks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int E=sc.nextInt();
        int M=sc.nextInt();
        int P=sc.nextInt();
        int C=sc.nextInt();
        int S=sc.nextInt();
        if(E>=35&M>=35&P>=35&C>=35&S>=35)
        {
            System.out.println("PASSED");
        }
        else
        {
            System.out.println("FAILED");
        }
    }
}