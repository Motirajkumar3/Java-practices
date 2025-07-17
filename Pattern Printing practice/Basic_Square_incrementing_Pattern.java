import java.util.Scanner;

public class Basic_Square_incrementing_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=i;
            for(int j=0;j<n;j++)
            {
                System.err.print(k+1+" ");
            }
            System.err.println();
        }
    }
}
