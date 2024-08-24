package Week7;
import java.util.Arrays;
public class TwoDArray {
    static void populate(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }


    // Display
    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]);

            }
        }
    }

    // Q1 Sum function built 

    //Q2 Linear Search 
    static int[] search(int[][] nums, int n){
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==n){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    // transpose 
    static void Transpose(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums[0].length;j++){
                int temp= nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]= temp;
            }
        }
    }

    // Rows
    static void Sortbyrows(int[][] nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
    }

    static void Sortbycol(int[][] nums){

    }
    // Whole Matrix
    static void Sortcomplete(int[][] nums){
        int[] arr= flaten(nums);
    }

    static int[] flaten(int[][] nums){
        int rows= nums.length;
        int cols= nums[0].length;
        int[] arr= new int[nums.length *nums[0].length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[]
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums= new int [3][4];
        int[] arr={1,2,3,4};
        populate(nums);
        display(nums);
        System.out.println(sum(arr));
        int[] indices=search(arr,7);
        System.out.println(indices[0]);
        System.out.println(" "+","+" ");
        System.out.println(indices[1]);
    }
}
        // int[][] nums= new int[3][4];
        // int [][][] grid= new int[4][2][1];  // 3D array
        // int[] arr= {1,2,3};                // Another way to initialise an array
        // int[][] nums= {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12}
        // };                                // by this we can also initialise an array
        // int[] arr= new int[5];
        // System.out.println(nums[0][1]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);    
