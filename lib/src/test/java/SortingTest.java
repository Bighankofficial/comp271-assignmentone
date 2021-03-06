import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {
    @Test
    public void runMergeSort() {
        MergeSort mergeSort = new MergeSort(1, 4, 6, 7);
        Integer min = mergeSort.removeMin();
        assertEquals(1, min);
    }

    @Test
    public void runSelectionSort() {

        // given
        SelectionSort selectionSort = new SelectionSort();
        int[] list = {3, 2 ,0, 4, 5, 1};

        // when
        int[] sortedList = selectionSort.selectionSort(list);

        // then
        assertEquals(0, sortedList[0]);
        assertEquals(1, sortedList[1]);
        assertEquals(2, sortedList[2]);
        assertEquals(3, sortedList[3]);
        assertEquals(4, sortedList[4]);
        assertEquals(5, sortedList[5]);
    }

    @Test
    public void runQuickSort() {

        // given
        QuickSort quickSort = new QuickSort(5, 2, 4, 1, 3);

        // when
        Integer min = quickSort.removeMin();

        // then
        assertEquals(1, min);
        assertEquals(2, min);
        assertEquals(3, min);
        assertEquals(4, min);
        assertEquals(5, min);
    }
}
