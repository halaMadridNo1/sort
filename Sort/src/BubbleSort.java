/**
 * Created by ${User} on 2018/9/15
 *  冒泡排序:
 *      比较相邻的两个元素,如果第一个比第二个大,就交换
 *      对每一个相邻的元素做同样的工作,从开始到结束,最后一个元素应该是最大的
 *      针对所有元素做以上操作,除了最后一个数
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {11,25,35,21,52,14,55,87,45};
        new BubbleSort().bullleSort(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
    public void bullleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
