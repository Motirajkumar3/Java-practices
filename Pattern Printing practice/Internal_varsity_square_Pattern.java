import java.util.Scanner;

public class Internal_varsity_square_Pattern {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0  || j==n-1 || i==n)
                System.err.print(n+" ");
                else
                System.err.print(i-j+1+" ");
            }
            System.err.println();
        }
    }
}
