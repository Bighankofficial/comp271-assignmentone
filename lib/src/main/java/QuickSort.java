public class QuickSort {
    public static int partition(int[] array, int left, int right, int pivot) {
        while(left <=right){
            while (array[left]< pivot){
                left++;
            }
            while(array[right]>pivot){
                right--;
            }
        }
        return left;
    }
}
