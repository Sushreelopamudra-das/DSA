

public class Movenegative {
    public static void main(String[] args) {
        
        int arr={-1,2,-3,4,5,6,-7,8,-9,-6,3};
        int left=0,right=arr.length-1;
        while (left<right) {
            while(arr[left]<0) left++;
            while(arr[right]>0) right--;

            if(left>=right) break;
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
        }
         
        System.out.println(arr);

            
         }
         

            
        

    }
    

