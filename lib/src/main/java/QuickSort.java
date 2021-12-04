import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    private int[] integers;

    public QuickSort(Integer... intsArg) {
        integers = new int[intsArg.length];
        for (int i = 0; i < intsArg.length; i++)
        {
            integers[i] = intsArg[i];
        }
        QuickSortMain(integers, 0, integers.length - 1);

    }
    public void QuickSortMain(int[] intsArg, int left, int right)
    {
        if (left >= right)
        {
            return;
        }
        int leftPartition = partition(intsArg, left, right);
        QuickSortMain(intsArg, left, leftPartition);
        QuickSortMain(intsArg, leftPartition + 1, right);
    }

    public int partition(int[] array, int left, int right) {
        int midpoint = left + (right - left) / 2;
        int pivot = array[midpoint];

        boolean done = false;
        while (!done)
        {
            while (array[left] < pivot)
            {
                left++;
            }
            while (array[right] > pivot)
            {
                right--;
            }

            if (left >= right)
            {
                done = true;
            }
            else
            {
                int swap = array[left];
                array[left] = array[right];
                array[right] = swap;
                left++;
                right--;
            }
        }
        return right;
    }

    public Integer removeMin() {
        if (integers == null || integers.length == 0)
        {
            return -1;
        }
        Integer retVal = integers[0];
        int[] newArr = new int[integers.length - 1];
        for (int i = 0; i < integers.length - 1; i++)
        {
            newArr[i] = integers[i+1];
        }
        integers = newArr;
        return retVal;
    }
}
