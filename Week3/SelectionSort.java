package Week3;
public class SelectionSort {
    static void Selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx= minimumvalue(arr, i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
    }
}

// Find the index of the minimum element from an array: arr
static int minimumvalue(int[] arr,int a){
    int mini= a;
    for(int i=a+1; i<arr.length;i++)
        if(arr[mini]>arr[i])
            mini=i;
    return mini;
}

static void display(int[] arr){
    for(int i:arr) System.out.print(i+" ");
    System.out.println();
}


public static void main(String[] args) {
int[] arr={2,4,5,6,7,3,9};
Selectionsort(arr);
display(arr);
}
}