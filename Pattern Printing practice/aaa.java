import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int k=1;
        for(int i=1;i<=n/2 +1;i++)
        {
            int s=k+i-1;
            for(int j=0;j<i;j++)
            {
                System.err.print(s-j +" ");
            }
            k+=i;
            System.err.println();
        }

        for(int i=n/2;i>=1;i--)
        {
            int s=k+i-1;
            for(int j=0;j<i;j++)
            {
                System.err.print(s-j+" ");
            }
            k+=i;
            System.err.println();
        }

       
    }
}
