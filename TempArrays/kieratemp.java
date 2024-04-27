import java.util.ArrayList;

public class kieratemp {

    private ArrayList<Object[]> myTempArray;

    public kieratemp() {
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
}