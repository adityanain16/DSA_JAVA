package Week3;

public class Upperbound {
    static int upperBound(int arr[], int num){
             int ans= -1;
         int low=0, high=arr.length-1,mid=0;
         while(low<=high){
             mid=(high+low)/2;
             if(arr[mid]==num){
                 ans=mid+1;
                 low=mid+1;
             }
             else if(arr[mid]>num){
                 high=mid-1;
             }
             else 
                low=mid+1;
         }
         return ans;
    }
    
    
    public static void main(String[] args) {
        int num= 2;
        int[] arr = {1,3,3,3,5,6,7,8,9};
        System.out.println(upperBound(arr,num));
    }
   
    }