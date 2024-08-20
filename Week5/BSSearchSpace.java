package Week5;

public class BSSearchSpace {
    static boolean check(int speed, int distance, int time){
        int dis_travelled=speed*time;
        if(dis_travelled>=distance)return true;
        else return false;
        // direct return bhi kra skte h 
    }
    static int Searchspace (int time , int distance){
        int low=0;
        int high= 200;
        int ans=-1;
        // int mid = high-(high-low)/2;
        while(low<=high){
           int mid=high-(high-low)/2;
            if(check(mid,distance,time)){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }

    public static void main(String args[]){
        int distance=100, time=2;
        System.out.println(Searchspace(time, distance));
}
}

