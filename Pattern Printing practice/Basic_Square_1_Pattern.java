import java.util.*;

class Basic_Square_1_Pattern
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.err.print(1+" ");
            }
            System.err.println();
        }
    }
}