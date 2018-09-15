/**
 * Created by ${User} on 2018/9/15
 *  快速排序:
 *      选择一个关键的值作为基准值,比基准值小的放左边,大的放右边
 */
public class QuitSort {
    public static void main(String[] args) {
        int arr[] = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = arr.length-1;
        new QuitSort().quitSort(arr,start,end);
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
    public void quitSort(int arr[],int low,int high){
        int start =low;
        int end = high;
        int key = arr[low];
        while (start<end){
            while (end>start && key <=arr[end]){
                end --;
            }
            if (key >= arr[end]){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            while (start<end && arr[start] <= key){
                start++;
            }
            if (arr[start] >=key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] =temp;
            }

        }
        if (start >low){
            quitSort(arr,low,start -1);
        }
        if (end <high){
            quitSort(arr,end+1,high);
        }

    }
}
