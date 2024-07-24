package LongestSubarray;
import java.util.*;
public class longest_subarray {
    public static int maxsub(int arr[] , int n){
        HashMap<Integer,Integer> mapp = new HashMap<Integer,Integer>();
        int max = 0;
        int sum = 0;

        for(int i = 0 ; i  < n ; i++){
            sum = sum + arr[i];
            if(sum == 0) {
                max = i + 1;     
            }
            else{
                if(mapp.get(sum)!=null){
                    max = Math.max( max ,i - mapp.get(sum));
                }
                else{
                    mapp.put( sum, i );
                }
            }
        }return max;
    }   public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        int n = 6;
        System.out.println(maxsub(arr,n));
    }
}
