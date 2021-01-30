package db.Staff;
//Test of the operations I have added.
//Test is successfull 30.01.2021
import java.util.Arrays;

import static db.Staff.ArrayOperations.addItem;

public class testArrayOperations {

    public static void main(String[] args){
        String[] array1 = {"A", "B", "C"};
        System.out.println(Arrays.toString(array1));
        array1 = addItem(array1, "D");
        System.out.println(Arrays.toString(array1));
    }

}