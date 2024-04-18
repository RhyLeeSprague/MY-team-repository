package TempArrays;

import java.util.ArrayList;

public class TempArrays {

    private ArrayList<Object[]> myTempArray;

    public TempArrays() {
        myTempArray = new ArrayList<>();
    }

    // edit

    public void editArrayObject(int arrayIndex, int objectIndex, Object newObject) {
        if (arrayIndex >= 0 && arrayIndex < myTempArray.size()) {
            if (objectIndex >= 0 && objectIndex < myTempArray.get(arrayIndex).length) {
                myTempArray.get(arrayIndex)[objectIndex] = newObject;
            } else {
                System.err.println("Object's index out of bounds");
            }
        } else {
            System.err.println("The chosen index is out of bounds");
        }
    }

    // add
    public void addArrayObject(int arrayIndex, Object newObject) {
        if (arrayIndex >= 0 && arrayIndex < myTempArray.size()) {
            if (newObject != null) {
                Object[] array = myTempArray.get(arrayIndex);
                ArrayList<Object> arrayList = new ArrayList<>(array.length);
                for (Object obj : array) {
                    arrayList.add(obj);
                }
                arrayList.add(newObject);
                myTempArray.set(arrayIndex, arrayList.toArray(new Object[0]));
            } else {
                System.out.println("Array index out of bounds");
            }
        }
    }

    // delete
    public void deleteArrayObject(int arrayIndex, int objectIndex) {
        if (arrayIndex >= 0 && arrayIndex < myTempArray.size()) {
            if (objectIndex >= 0 && objectIndex < myTempArray.get(arrayIndex).length) {
                Object[] array = myTempArray.get(arrayIndex);
                Object[] editedArray = new Object[array.length - 1];
                int newIndex = 0;
                for (int i = 0; i < array.length; i++) { // tried using System.arraycopy
                    if (i != objectIndex) {
                        editedArray[newIndex++] = array[i];
                    }
                }
                myTempArray.set(arrayIndex, editedArray);
            } else {
                System.out.println("Object index is out of bounds");
            }
        } else {
            System.out.println("Array index out of bounds");
        }
    }

    // read
    public void printArrayObjects(int arrayIndex) {
        if (arrayIndex >= 0 && arrayIndex < myTempArray.size()) {
            Object[] array = myTempArray.get(arrayIndex);
            System.out.print("Objects in array " + arrayIndex + ": ");
            for (Object obj : array) {
                System.out.print(obj + " ");
            }
            System.out.println();
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    public void innerArrays(Object[] newArray) {
        myTempArray.add(newArray);
    }
}