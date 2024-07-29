package Week3;

public class LowerBound{
    static int Lowerbound(int arr[], int num){
        int firstOccurance= -1;
        int low=0,high=arr.length-1,mid= 0;
        while(low<=high){
            mid= (low+high)/2;
            if(arr[mid]==num){
                firstOccurance=mid;
                high=mid-1;
            }
            else if(arr[mid]>num){
                high=mid-1;
            }
            else
               low=mid+1;
        }
        return firstOccurance;

    }


    public static void main(String[] args) {
        int num= 3;
        int[] arr = {1,3,3,3,5,6,7,8,9};
        System.out.println(Lowerbound(arr,num));
}
}