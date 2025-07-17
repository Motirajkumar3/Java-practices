import java.util.Scanner;

public class Basic_Right_Triangle_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.err.print(k+++" ");
            }
            System.err.println();
        }
    }
}
