//Brute force solution
package LongestSubarray;
public class longestsubarray {
    
    public static int maxsub(int arr[]){
        int n = arr.length;
        int max  = 0;
        for(int i = 0 ;  i<n ;i++ ){
            int sum =  0 ;
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
			    if(sum == 0){
				    max = Math.max(max, j-i+1);
			}
            }
        }return max;
    }public static void main(String args[]) 
    { 
        int arr[] = {9, -3, 3, -1, 6, -5};
        System.out.println(maxsub(arr));
    } 
    
}
