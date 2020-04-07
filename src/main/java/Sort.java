import java.util.Random;

/**
 * @project tutorial
 * @autor Marcus Jonnson Ewerbring and Diego Leon  on 2020-04-03.
 */
public class Sort {

    private static Random random = new Random();

    /**
     * The method sorts a list of in ascending order
     * @param list integer list that will be sorted
     */
    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            for(int index = i; index>0 && list[index-1] > list[index] ; index--){
                swap(index,index-1, list);
            }
        }
    }

    /**
     * A method for shuffling an integer array
     * @param list integer list that will be shuffled
     */
    public static void shuffle(int[] list){

        for(int i = 0; i < list.length; i++){
            int rand = random.nextInt(list.length);
            swap(i, rand, list);
        }

    }

    /**
     * The method swap, swaps values of two given positions in a list
     * @param pos1 position of value 1 to be swapped
     * @param pos2 position of value 2 to be swapped
     * @param list the list where the swap should be conducted
     */
    public static void swap(int pos1, int pos2, int[] list){
        int tmp = list[pos1];
        list[pos1] = list[pos2];
        list[pos2] = tmp;
    }

}
