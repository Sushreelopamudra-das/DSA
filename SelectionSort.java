public class SelectionSort {
   static void selectionsort(int arr[]){
         for(int i=0;i<=arr.length-2;i++){
            int mini=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int t=arr[mini];
            arr[mini]=arr[i];
            arr[i]=t;
            
        }
        
    }
    public static void main(String []args){
        int [] arr={10,5,15,4,3,2};
        int i;
        for( i=0;i<=arr.length;i++){
            selectionsort(arr);
            for( i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }

        }
       
       
    
    }
}
