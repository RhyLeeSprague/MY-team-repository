package HRDatabaseofficial;

public class test {
    public static void main(String[] args)
    {
        Demographics person = new Demographics();
        GUI obj = new GUI();

        person.makeAPerson();
        GUIhelper gui = new GUIhelper();
        obj.frame();
    }

    public test(){}
}
