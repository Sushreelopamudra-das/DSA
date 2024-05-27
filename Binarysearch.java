package Binarysearch;

public class Binarysearch {
    public static int binarysearch(int []nums, int target){
        int n = nums.length;
        int low =0,high=n-1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)
            return mid;
            else if(target > nums[mid]) low =mid+1;
            else high = mid - 1;
        }
        return-1;

    }
    public static void main(String[] args) {
        int [] a = {2,3,4,5,6,7,8,9};
        int target = 5;
        int ind = binarysearch(a, target);
        if (ind == -1) 
            System.out.println("Element not found");
        else 
         System.out.println("Element found at index " + ind);
        
    }
    
}
