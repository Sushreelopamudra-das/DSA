public class LargestElementArray {
    public static void main(String[] args) {
        int arr[]={8,5,3,2,1,6};

        int largest=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println(largest);
        
    }
    
}
