void main(){
    Deletion deletion = new Deletion();

    // array with size of 5
    int array[] = {1, 2, 3, 4, 5};

    System.out.println("Original Array: " + Arrays.toString(array));

    // position to be deleted
    int position = 3;

    array = deletion.deleteByPosition(array, position);
    System.out.println("Array after deletion: " + Arrays.toString(array));

    // value to be deleted
    int x = 2;

    array = deletion.deleteByValue(array, x);
    System.out.println("Array after deletion: " + Arrays.toString(array));
}

public class Deletion {
    public static int[] deleteByPosition(int array[], int position){
        int n = array.length;
        int newArray[] = new int[n - 1];

        // insert from old to new from start to position
        // then skip the position and insert the rest from old to new
        for (int i = 0, j = 0; i < n; i++) {
            if (i != position - 1) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }

    public static int[] deleteByValue(int array[], int x){
        int n = array.length;
        int newArray[] = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
            if (array[i] != x) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }
}
