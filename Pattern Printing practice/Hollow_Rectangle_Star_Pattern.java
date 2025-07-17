import java.util.Scanner;

public class Hollow_Rectangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int b=sc.nextInt();
        int h=sc.nextInt();

        for(int i=0;i<b;i++)
        {
            for(int j=0;j<h;j++)
            {
                if(i==0 || i==b-1 || j==0 || j==h-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.err.println();
        }
    }
}
