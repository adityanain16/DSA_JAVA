package Week4;

public class KadaneAlgo {
    public static int kadanesAlgo(int[] nums) {
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currsum = currsum + nums[i];
            maxsum = Math.max(maxsum,currsum);
            if(currsum<=0){
                currsum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,3,3,5,6,7,8,9};
        System.out.println(kadanesAlgo(arr));
}
}