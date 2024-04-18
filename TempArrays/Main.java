package TempArrays;

public class Main { // Non project file
    public static void main(String[] args) {

        TempArrays firstTempArray = new TempArrays();

        firstTempArray.innerArrays(new String[] { "Adult", "Teen", "Grandparent" });
        firstTempArray.innerArrays(new String[] { "Full Price", "Double Price", "Half Price" });

        firstTempArray.addArrayObject(0, "Old People");
        firstTempArray.editArrayObject(0, 0, "Child");
        firstTempArray.deleteArrayObject(1, 1);

        firstTempArray.printArrayObjects(0);
        firstTempArray.printArrayObjects(1);

    }
}
