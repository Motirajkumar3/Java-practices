import java.util.*;
public class Parallelogram_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();

        for(int i=0;i<b;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.err.print(" ");
            }
            for(int j=0;j<h;j++)
            {
                System.err.print("* ");
            }
            System.err.println();
        }
    }
}
