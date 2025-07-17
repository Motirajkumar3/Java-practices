import java.util.Scanner;

public class Half_Diamond_Star_Pattern_Inverted {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.err.print("  ");
            }
            for(int j=0;j<=i;j++)
            {
                System.err.print("* ");
            }
            System.err.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.err.print("  ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.err.print("* ");
            }
            System.err.println();

        }
    }
}
