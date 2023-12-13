
public class p8 {
public static void main(String[] args) {
    int arr[]= {2,-1,3,-4,5,-6,7};
    int i=0;
    for( i=0; i<arr.length; i++){
        int k=0;
        if(arr[i]<0){
            int t=arr[i];
            for(int j=i-1; j>0; j--){
                if(arr[i]>0){
                    arr[j+1]=arr[j];
                    k =j;

                }
                else{
                   k= j+1;
                   break;

                }
            }
            arr[k]=t;

        }
         System.out.print(arr[i]+" ");
    }
   
}
}
