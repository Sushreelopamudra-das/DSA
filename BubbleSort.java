public class BubbleSort {
    static void bubblesort(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
           for(int j=0;j<=i-1;j++){
               if(arr[j]>arr[j+1]){
                int t=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=t;
               }
           }
           
        }       
    }
    public static void main(String []args){
        int [] arr={10,5,15,4,3,2};
        int j;
        for( j=0;j<=arr.length;j++){
            bubblesort(arr);
            for( j=0;j< arr.length;j++){
                System.out.println(arr[j]+" ");
            }

        }
       
       
    
    }
}
