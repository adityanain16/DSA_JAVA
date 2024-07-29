package Week3;

public class CountOccurence {
    static int LowerBound(int arr[], int num){
        //lower bound
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

    int Upperbound(int arr[], int num)
    // Upper bound 
    int ans= -1;
    int low=0;high=arr.length-1;mid=0;
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
   
    
    static int countoccurance(int[] arr,int num){
        int lb= LowerBound(arr, num);
        if(lb==-1) return 0;
       int ub= Upperbound(arr,num);
       return ub-lb;
    }
}