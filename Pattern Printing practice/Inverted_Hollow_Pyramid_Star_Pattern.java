import java.util.Scanner;

public class Inverted_Hollow_Pyramid_Star_Pattern {
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
                if( i==n || j==n || i==0 ||j==0 || j==n-i)
                System.err.print("* ");
                else
                System.err.print("  ");
            }
            System.err.println();
        }
    }
}
