import java.util.Scanner;

public class Mirrored_Rhombus_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.err.print(" ");
            }
            for(int j=0;j<n;j++)
            {
                System.err.print("* ");
            }
            System.err.println();
        }
    }
}
