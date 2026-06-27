void main(){
    Searching searching = new Searching();

    // array with size of 5
    int array[] = {5, 3, 1, 2, 4};

    System.out.println("Original Unsorted Array: " + Arrays.toString(array));

    // value to be searched
    int key = 4;

    int position = searching.unsortedLinearSearch(array, key);
    if (position == -1){
        System.out.println(key + " is not found in the array");
    } else {
        System.out.println(key + " is found at position " + (position + 1) );
    }

    // new array with size of 5
    int array2[] = {10, 20, 30, 40, 50};

    System.out.println("\nOriginal Sorted Array: " + Arrays.toString(array2));

    //value to be searched
    int key2 = 20;

    int position2 = searching.sortedBinarySearch(array2, key2);
    if (position2 == -1){
        System.out.println(key2 + " is not found in the array");
    } else {
        System.out.println(key2 + " is found at position " + (position2 + 1) );
    }
}

public class Searching {
    public static int unsortedLinearSearch(int array[], int key){
        int n = array.length;

        for (int i = 0; i < n; i++){
            if (array[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static int sortedBinarySearch(int array[], int key){
        int n = array.length;
        int left = 0;
        int right = n - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (array[mid] == key){
                return mid;
            }

            if (array[mid] < key){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
