package Week3;
// import java.util.Arrays;
public class InsertionSort {
    static void Insertionsort(int[] arr){

//insertionSort
//static void Insertionsort(int arr[]){
    //int n=arr.length;
    for(int i=1;i<arr.length;i++){
        int key= arr[i];
        int j= i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]= arr[j];
            --j;
        }
        arr[j+1]= key;
    }
}

static void display(int[] arr){
    for(int i:arr) System.err.print(i+ " ");
    System.err.println();
}
    

public static void main(String[] args) {
int[] arr={2,4,5,1,6,7,8,3,9};
Insertionsort(arr);
display(arr);
}
}
