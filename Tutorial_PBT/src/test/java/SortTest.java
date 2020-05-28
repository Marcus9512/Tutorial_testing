import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import net.jqwik.api.*;

/**
 * @project tutorial
 */
class SortTest {

    @Example
    void insertionSort() {
        int[] list = {3,2,6,1};
        int[] res = {1,2,3,6};
        Sort.insertionSort(list);
        assertArrayEquals(res,list);
    }

    @Example
    void shuffle() {
        HashMap<String, Integer> mem = new HashMap<String, Integer>();
        int repetitions = 100000;

        for(int i= 0; i < repetitions; i++){
            int[] list = {1,2,3,4};
            Sort.shuffle(list);
            String key = Arrays.toString(list);
            if(mem.containsKey(key)){
                mem.replace(key,mem.get(key) +1 );
            }else{
                mem.put(key, 1);
            }
        }
        double combinations = 4*3*2;
        double expectedValue = repetitions/combinations;
        double acceptedDiff = 2000;

        Set<String> keys = mem.keySet();
        for(String key: keys){
            double numb = mem.get(key);
            assertTrue( Math.abs(numb - expectedValue) < acceptedDiff);
        }

    }

    @Example
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

    @Example
    void swapOutOfBounds(){
        int[] list = {1,2,3,4};
        int[] res1 = {1,2,3,4};

        Sort.swap(0,4, list);
        assertArrayEquals(res1,list);
    }

}