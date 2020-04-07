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
    void swapOutOfBounds(){
        int[] list = {1,2,3,4};
        int[] res = {1,2,3,4};
    }

    @Test
    void swap() {

    }

    @Test
    void shuffle() {

    }

}