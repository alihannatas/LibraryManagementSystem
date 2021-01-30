package db.Staff;
//Class for doing array operations, if we design officer/staff table to have some of it's columns to have multiple values then we can use this operations.
//This should be tested
public class ArrayOperations {

    public static int min(int number1, int number2){
        if(number1 < number2){
            return number1;
        }else if(number1 > number2){
            return number2;
        }else {
            return number1;
        }
    }

    public static void assign(String[] array1, String[] array2){
        int sizeOfArray1 = array1.length;
        int sizeOfArray2 = array2.length;
        int smallSize = min(sizeOfArray1, sizeOfArray2);
        for(int index = 0; index < smallSize; index++){
            array1[index] = array2[index];
        }
    }

    public static String[] addItem(String[] array, String item){
        int sizeOfArray = array.length;
        String[] newArray = new String[sizeOfArray + 1];
        assign(newArray, array);
        newArray[sizeOfArray] = item;
        return newArray;
    }

}
