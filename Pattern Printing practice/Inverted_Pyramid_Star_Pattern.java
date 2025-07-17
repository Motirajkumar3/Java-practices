import java.util.Scanner;

public class Inverted_Pyramid_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.err.print(" ");
            }
            for(int j=n-i;j>=0;j--)
            {
                System.err.print("* ");
            }
            System.err.println();
        }
    }
}
