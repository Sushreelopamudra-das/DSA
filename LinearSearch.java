public class LinearSearch {
     static int search(int arr[],int n,int num){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] == num)
            return i;
                
        }
         return -1;

    }
     public static void main(String[] args) {
        
     int arr[] = {2,3,4,5,6,7};
     int num = 5;
     int n = arr.length;
     int val = search(arr,n,num);

     System.out.println(val);

     }


     
}
