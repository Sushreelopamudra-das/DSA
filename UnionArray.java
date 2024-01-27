
public class UnionArray{
  static void union(int a[],int b[],int m,int n){
    int i=0, j=0;
  while(i<m && j<n){
      while(i+1<m && a[i]==a[i+1])
      i++;
        while(j+1<n && a[j]==a[j+i])
        j++;
      
      if(a[i]<a[j])
      System.out.print(a[i++]);
      
      else if(b[j]<a[i]){
        System.out.println(b[j++]);
      }
      else{
        System.out.println(a[j]);
        i++;
      }
    }
  
    
    while(i<m){
      while(i+1<m && a[i]==a[i+1])
      System.out.println(a[i++]);
    }
      while(j<n){
        while(j+1<n && b[j]==b[j+1])
        System.out.println(b[j++]);
      }
    }
  
  public static void main(String []args){
    int[] a={1,3,4,5,7,9};
    int[] b={2,3,4,5,8,9};
    int m=a.length;
    int n=b.length;
    union(a,b,m,n);
  }
}
  
