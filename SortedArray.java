public class SortedArray {
     static boolean arraySortedOrNot(int arr[],int n){
        if(n==0|| n==1)
        return true;
        for(int i=1;i<n;i++){
        
            if(arr[i]<=arr[i-1]){
                return true;
             }

            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={9,10,8,3,2,7};
        int n=arr.length;
        
        if(arraySortedOrNot(arr, n))
         System.out.println("yes");
         
         else
         System.out.print("NO");
    }
}   
     