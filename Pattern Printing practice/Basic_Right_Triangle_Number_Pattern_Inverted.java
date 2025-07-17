import java.util.Scanner;

public class Basic_Right_Triangle_Number_Pattern_Inverted {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=0;
        for(int i=0;i<=n;i++)
        k+=i;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.err.print(k--+" ");
            }
            System.err.println();
        }
    }
}
