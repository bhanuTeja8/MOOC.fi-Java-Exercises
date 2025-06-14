public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }
            if(array[middle]>searchedValue){
                end=middle-1;
            }
            else 
                beginning=middle+1;
            // restrict the search area 
        }
        return false;
    }
}