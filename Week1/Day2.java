package Week1;

public class Day2 {
    int n=6;

         {for(int i=n;i>=1;i--){
             for(int k=1;k<=(n-i);k++)
                 System.out.print("    "); // Use 2 space
             for(int j=1;j<=i;j++)
                 System.out.print("* ");
             System.out.println();
}}
}