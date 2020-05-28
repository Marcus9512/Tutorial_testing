import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @project tutorial
 */
class SortTest {

    @Test
    void insertionSort() {
        int[] list = {3,2,6,1};
        int[] res = {1,2,3,6};
        Sort.insertionSort(list);
        assertArrayEquals(res,list);
    }

    @Test
    void swap() {
        int[] list = {1,2,3,4};
        int[] res1 = {4,2,3,1};
        int[] res2 = {4,3,2,1};
        int[] res3 = {4,1,2,3};

        Sort.swap(0,3, list);
        assertArrayEquals(res1,list);

        Sort.swap(1,2, list);
        assertArrayEquals(res2,list);

        Sort.swap(1,3, list);
        assertArrayEquals(res3,list);
    }

    @Test
    void swapOutOfBounds(){
        int[] list = {1,2,3,4};
        int[] res = {1,2,3,4};
    }

    @Test
    void shuffle() {

    }

}