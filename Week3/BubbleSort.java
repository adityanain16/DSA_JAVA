package Week3;

public class BubbleSort {
    static int bubbleSort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0; i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
        }
        return 0;
    }

    static void display(int[] arr){
        for(int i:arr) System.err.print(i+" ");
        System.err.println();
    }

public static void main(String[] args) {
    int[] arr={2,4,5,6,7,3,9};
    bubbleSort(arr);
    display(arr);
}
}
