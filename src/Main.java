public static void main(String[] args){
    // array with size of 5
    int array[] = {1, 2, 3, 4, 5};

    System.out.println("Original Array: " + Arrays.toString(array));

    // new value to be added
    int x = 6;

    array = addValue(array, x);

    System.out.println("\nNew Array with added value: " + Arrays.toString(array));

    x = 10;

    // position of new value
    int position = 4;

    array = insertValue(array, x, position);

    System.out.println("\n"
            + x
            + " is inserted at position "
            + position
            + "\nNew Array: "
            + Arrays.toString(array));
}

public static int[] addValue(int array[], int x){
    int n = array.length;
    int newArray[] = new int[n + 1];

    // insert all element from old to new array
    // then add new value at the end
    for (int i = 0; i < n; i++)
        newArray[i] = array[i];

    newArray[n] = x;

    return newArray;
}

public static int[] insertValue(int array[], int x, int position){
    int n = array.length;
    int i;

    // create new array n+1
    int newArray[] = new int[n+1];

        /*
        insert from old to new from start to position
        then insert new value
        then insert the rest from old to new from position
         */
    for (i = 0; i < n + 1; i++){
        if (i < position - 1){
            newArray[i] = array[i];
        }
        else if (i == position - 1){
            newArray[i] = x;
        }
        else
            newArray[i] = array[i - 1];
    }
    return newArray;
}




