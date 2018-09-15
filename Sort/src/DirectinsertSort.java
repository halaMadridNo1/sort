/**
 * Created by ${User} on 2018/9/15
 *  插入排序:
 *      每次执行,把后面的数插入到前面已经排序好的数组中,知道最后一个完成
 */
public class DirectinsertSort {
    public static void main(String[] args) {
        int arr[] = {11,23,14,88,99,77,55,67,66};
        new DirectinsertSort().directinsertSort(arr);
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
    public void directinsertSort(int arr[]){
        int j ,temp;
        for (int i = 1; i < arr.length; i++) {
            temp =arr[i];
            for ( j = i-1; j >=0 ; j--) {
                if (temp >= arr[j]){
                    break;
                }
                arr[j+1] = arr[j];
            }
            arr[j+1] =temp;
        }
    }
}
