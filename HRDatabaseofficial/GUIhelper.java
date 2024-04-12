package HRDatabaseofficial;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;


public class GUIhelper {

    public GUIhelper(){} //default constructor

    public String getName(ArrayList<GUIhelper> list, int index)
    {
        for(int i=0; i<list.size();i++)
        {
            if(i==index)
            {
                //later
            }
        }
        return "";
    }

    public String[] convertObjectArray(ArrayList<GUIhelper> list) //converts Object[] to String[]
    {
        String[] finalList = new String[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            GUIhelper iterator = list.get(i); //finds object at that specific index
            String name = iterator.getName(list, i); //loops through object and returns name
            finalList = addTo(name, finalList); //adds the found name to the array
        }
        return finalList;
    }

    public String[] addTo(String name, String[] list) //appends a variable to a String[]
    {
        String[] newArray = Arrays.copyOf(list, list.length + 1); //creates a bigger duplicate list
        newArray[list.length] = name; //adds the name to the end of the array
        return newArray;
    } 
}
