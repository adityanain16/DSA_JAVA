package Week4;

public class NGEL {
    static int[] ngel(int[] arr){
        int maxElement= 0;
        int[] ngel= new int[arr.length];
        for(int i=0;i>=arr.length-1;i++){
            ngel[i]= maxElement;
            maxElement= Math.max(arr[i], maxElement);
        }
        return ngel;
    }
    public static void main(String[] args) {
        int[] arr= {9,6,4,1,7,3,5,2,8};
        int[] num= ngel(arr);
        for(int i:num)
            System.out.print(i+" ");
    }
}
