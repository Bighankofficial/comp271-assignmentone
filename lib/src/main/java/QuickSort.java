import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    private final List<Integer> integers;

    public QuickSort(Integer... integers) {
        this.integers = new ArrayList<>();
        for (Integer integer : integers) {
            this.integers.add(integer);
        }
    }

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

    public Integer removeMin() {
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
