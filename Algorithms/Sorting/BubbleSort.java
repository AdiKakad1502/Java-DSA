package Algorithms.Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = new int[] {9,3,6,2,5,4,0,3,1,11};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1 ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
