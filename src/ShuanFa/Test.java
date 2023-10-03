package ShuanFa;

public class Test {
    public static void main(String[] args) {
        int[]arr={6,1,2,7,9,3,4,5,8,14,13,15,19,18};
        quickSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int i, int j) {
        int start=i;
        int end=j;
        if(end<start){
            return;
        }
        int baseNumber=arr[i];
        //start 从前往后,找大的
        //end 找小的
        while (start!=end) {
            while (true){
               if(end<=start||arr[end]<baseNumber){
                 break;
               }
               end--;
            }
            while (true){
                if(end<=start||arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;

        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);

    }
}
