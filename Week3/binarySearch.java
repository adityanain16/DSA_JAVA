package Week3;

public class binarySearch {
    static int BinarySearch(int[] arr,int num){    
        int low= 0, high= arr.length-1;
        int mid=0;
        while(low<=high){
            mid= (low+high)/2;
            if(arr[mid]==num)
                return mid;
            else if(arr[mid]<num){
                low= mid+1;
            }
            else
               high= mid-1;
        }
        return -1;
    }
    
    
     public static void main(String[] args) {
        int num= 3;
        int[] arr = {1,3,3,3,5,6,7,8,9};
        System.out.println(BinarySearch(arr,num));
    }
}


